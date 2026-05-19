import CalculatorVisitor from './CalculatorVisitor.js';

export default class CustomCalculatorVisitor extends CalculatorVisitor {

    visitDsl(ctx) {
        let jsCode = `// --- CÓDIGO JAVASCRIPT GENERADO ---\n`;
        jsCode += `let intentoAccesoFueraHorario = true;\n`;
        jsCode += `let intentosFallidos = 6;\n`;
        jsCode += `let accesoARecursosSensibles = true;\n`;
        jsCode += `let esAdministrador = false;\n`;
        jsCode += `const listaNegraUsuarios = new Set();\n`;
        jsCode += `const listaNegraIPs = new Set();\n\n`;

        const funcNames = [];
        for (const reglaCtx of ctx.regla()) {
            const funcName = reglaCtx.IDENTIFICADOR().getText();
            funcNames.push(funcName);
            jsCode += this.visit(reglaCtx);
        }

        for (const name of funcNames) {
            jsCode += `${name}();\n`;
        }

        return jsCode;
    }

    visitRegla(ctx) {
        const funcName = ctx.IDENTIFICADOR().getText();
        const condicionStr = this.visit(ctx.condicion());
        const comandoStr = this.visit(ctx.comando());

        let code = `function ${funcName}() {\n`;
        code += `  if (${condicionStr}) {\n`;
        code += `    const usuario = "usuario_sospechoso";\n`;
        code += `    const ip = "192.168.1.100";\n`;
        code += `    ${comandoStr}\n`;
        code += `  }\n`;
        code += `}\n\n`;

        return code;
    }

    visitCondAcceso(ctx) {
        return `intentoAccesoFueraHorario`;
    }

    visitCondIntentos(ctx) {
        return `intentosFallidos > ${ctx.DIGITO().getText()}`;
    }

    visitCondSospechosa(ctx) {
        return `accesoARecursosSensibles && !esAdministrador`;
    }

    visitCmdUsuario(ctx) {
        return `listaNegraUsuarios.add(usuario);\n    console.log(\`[ACCIÓN] Usuario "\${usuario}" agregado a lista negra de usuarios.\`);`;
    }

    visitCmdIP(ctx) {
        return `listaNegraIPs.add(ip);\n    console.log(\`[ACCIÓN] IP "\${ip}" agregada a lista negra de IPs.\`);`;
    }

    visitCmdMonitoreo(ctx) {
        return `console.log(\`[ACCIÓN] Monitoreo detallado activado para "\${usuario}".\`);`;
    }
}