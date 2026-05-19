import antlr4 from 'antlr4';
import fs from 'fs';
import { fileURLToPath } from 'url';
import { dirname, join } from 'path';
import CalculatorLexer from './CalculatorLexer.js';
import CalculatorParser from './CalculatorParser.js';
import CustomCalculatorVisitor from './CustomCalculatorVisitor.js';

const __dirname = dirname(fileURLToPath(import.meta.url));

class ErrorCollector extends antlr4.error.ErrorListener {
    constructor() {
        super();
        this.errors = [];
    }
    syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
        this.errors.push(`  Línea ${line}, columna ${column}: ${msg}`);
    }
}

function main() {
    let input;
    try {
        input = fs.readFileSync(join(__dirname, 'input.txt'), 'utf-8');
    } catch (err) {
        console.error('Error: No se pudo leer el archivo input.txt:', err.message);
        process.exit(1);
    }

    console.log("=== ARCHIVO DE ENTRADA (input.txt) ===");
    console.log(input.trim());

    // --- Análisis Léxico ---
    const chars = antlr4.CharStreams.fromString(input);
    const lexerErrors = new ErrorCollector();
    const lexer = new CalculatorLexer(chars);
    lexer.removeErrorListeners();
    lexer.addErrorListener(lexerErrors);

    const tokens = new antlr4.CommonTokenStream(lexer);
    tokens.fill();

    console.log("\n=== PUNTO 2: TABLA DE LEXEMAS Y TOKENS ===");
    console.log("Lexema".padEnd(35) + "Token");
    console.log("-".repeat(55));
    for (const token of tokens.tokens) {
        if (token.type !== antlr4.Token.EOF) {
            const tokenName = CalculatorLexer.symbolicNames[token.type] ?? `DESCONOCIDO(${token.type})`;
            console.log(`'${token.text}'`.padEnd(35) + tokenName);
        }
    }

    // --- Análisis Sintáctico ---
    tokens.reset();
    const parserErrors = new ErrorCollector();
    const parser = new CalculatorParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(parserErrors);
    parser.buildParseTrees = true;
    const tree = parser.dsl();

    const allErrors = [...lexerErrors.errors, ...parserErrors.errors];

    console.log("\n=== PUNTO 1: ANÁLISIS LÉXICO Y SINTÁCTICO ===");
    if (allErrors.length > 0) {
        console.log(`Se encontraron ${allErrors.length} error(es):`);
        allErrors.forEach(e => console.log(e));
        return;
    }
    console.log("Entrada válida. Sin errores léxicos ni sintácticos.");

    console.log("\n=== PUNTO 3: ÁRBOL DE ANÁLISIS SINTÁCTICO ===");
    console.log(tree.toStringTree(parser.ruleNames, parser));

    console.log("\n=== PUNTO 4: TRADUCCIÓN E INTERPRETACIÓN EN JAVASCRIPT ===");
    const visitor = new CustomCalculatorVisitor();
    const jsGenerado = visitor.visit(tree);

    console.log("--- Código JavaScript generado ---");
    console.log(jsGenerado);

    console.log("--- Resultado de la ejecución ---");
    eval(jsGenerado);
}

main();