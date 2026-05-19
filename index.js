import antlr4 from 'antlr4';
import fs from 'fs';
import CalculatorLexer from './CalculatorLexer.js';
import CalculatorParser from './CalculatorParser.js';
import CustomCalculatorVisitor from './CustomCalculatorVisitor.js';

function main() {

    const input = fs.readFileSync('input.js', 'utf-8');

    const chars = new antlr4.InputStream(input);
    const lexer = new CalculatorLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);

    tokens.fill();
    console.log("=== PUNTO 2: TABLA DE LEXEMAS Y TOKENS ===");
    for (let token of tokens.tokens) {
        if (token.type !== -1) { 
            const tokenName = CalculatorLexer.symbolicNames[token.type];
            console.log(`Lexema: '${token.text.padEnd(25)}' | Token: ${tokenName}`);
        }
    }

    tokens.reset();

    const parser = new CalculatorParser(tokens);
    parser.buildParseTrees = true;
    const tree = parser.dsl();

    if (parser.syntaxErrorsCount > 0) {
        console.error("\n=== PUNTO 1: ERRORES ENCONTRADOS ===");
        console.error("Se encontraron errores de sintaxis en la entrada.");
        return;
    } else {
        console.log("\n=== PUNTO 1: ANÁLISIS SINTÁCTICO ===");
        console.log("Entrada correcta. Cero errores.");
    }

    console.log("\n=== PUNTO 3: ÁRBOL DE ANÁLISIS SINTÁCTICO CONCRETO ===");
    console.log(tree.toStringTree(parser.ruleNames, parser));

    console.log("\n=== PUNTO 4: TRADUCCIÓN E INTERPRETACIÓN ===");
    const visitor = new CustomCalculatorVisitor();
    const jsGenerado = visitor.visit(tree);
    
    console.log("--- Código Traducido ---");
    console.log(jsGenerado);
    
    console.log("--- Ejecución del Código ---");
    eval(jsGenerado); 
}

main();