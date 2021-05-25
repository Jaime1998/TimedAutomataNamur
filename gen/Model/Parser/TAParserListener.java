// Generated from C:/Users/57310/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/src/Model/Parser\TAParser.g4 by ANTLR 4.9.1
package Model.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TAParser}.
 */
public interface TAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TAParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(TAParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(TAParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#automaton}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton(TAParser.AutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#automaton}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton(TAParser.AutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(TAParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(TAParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#clock}.
	 * @param ctx the parse tree
	 */
	void enterClock(TAParser.ClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#clock}.
	 * @param ctx the parse tree
	 */
	void exitClock(TAParser.ClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(TAParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(TAParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(TAParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(TAParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumSub(TAParser.SumSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumSub(TAParser.SumSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(TAParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(TAParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(TAParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(TAParser.ParensExprContext ctx);
}