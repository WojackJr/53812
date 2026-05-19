import CalculatorVisitor from './CalculatorVisitor.js';

export default class CustomCalculatorVisitor extends CalculatorVisitor {
    
    visitDsl(ctx) {
        let jsCode = `// --- TRADUCCIÓN A JAVASCRIPT ---\n`;
        jsCode += `let intentoAccesoFueraHorario = true;\n`;
        jsCode += `const listaNegra = new Set();\n`;
        
        const reglas = ctx.regla();
        reglas.forEach((reglaCtx) => {
            jsCode += this.visit(reglaCtx);
        });

        jsCode += `\ngestionarBloqueo();\n`;
        return jsCode;
    }

    visitRegla(ctx) {
        const condicionStr = this.visit(ctx.condicion());
        const comandoStr = this.visit(ctx.comando());

        let funcCode = `function gestionarBloqueo() {\n`;
        funcCode += `  if (${condicionStr}) {\n`;
        funcCode += `    const usuario = "usuario_sospechoso";\n`;
        funcCode += `    ${comandoStr}\n`;
        funcCode += `  }\n`;
        funcCode += `}\n`;
        
        return funcCode;
    }

    visitCondAcceso(ctx) { return `intentoAccesoFueraHorario`; }
    visitCondIntentos(ctx) { return `intentosFallidos > ${ctx.DIGITO().getText()}`; }
    visitCondSospechosa(ctx) { return `accesoARecursosSensibles && !esAdministrador`; }

    visitCmdUsuario(ctx) { 
        return `listaNegra.add(usuario);\n    console.log(\`Bloqueando a \${usuario} por intento de acceso fuera de horario.\`);`; 
    }
    visitCmdIP(ctx) { return `agregarIPAListaNegra(usuario);`; }
    visitCmdMonitoreo(ctx) { return `activarMonitoreoDetallado(usuario);`; }
}