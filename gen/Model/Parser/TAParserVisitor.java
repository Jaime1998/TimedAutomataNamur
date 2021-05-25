// Generated from C:/Users/57310/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/src/Model/Parser\TAParser.g4 by ANTLR 4.9.1
package Model.Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TAParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TAParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(TAParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#automaton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomaton(TAParser.AutomatonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(TAParser.LocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#clock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClock(TAParser.ClockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(TAParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(TAParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSub(TAParser.SumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(TAParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(TAParser.ParensExprContext ctx);
}