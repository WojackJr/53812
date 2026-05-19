// Generated from /home/Brian/Escritorio/53812/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(CalculatorParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(CalculatorParser.DslContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(CalculatorParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(CalculatorParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(CalculatorParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(CalculatorParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAcceso}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondAcceso(CalculatorParser.CondAccesoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAcceso}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondAcceso(CalculatorParser.CondAccesoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIntentos}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondIntentos(CalculatorParser.CondIntentosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIntentos}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondIntentos(CalculatorParser.CondIntentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condSospechosa}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondSospechosa(CalculatorParser.CondSospechosaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condSospechosa}
	 * labeled alternative in {@link CalculatorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondSospechosa(CalculatorParser.CondSospechosaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdUsuario}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterCmdUsuario(CalculatorParser.CmdUsuarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdUsuario}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitCmdUsuario(CalculatorParser.CmdUsuarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdIP}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterCmdIP(CalculatorParser.CmdIPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdIP}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitCmdIP(CalculatorParser.CmdIPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdMonitoreo}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterCmdMonitoreo(CalculatorParser.CmdMonitoreoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdMonitoreo}
	 * labeled alternative in {@link CalculatorParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitCmdMonitoreo(CalculatorParser.CmdMonitoreoContext ctx);
}