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
	 * Visit a parse tree produced by {@link TAParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(TAParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TAParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(TAParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TAParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(TAParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialiser(TAParser.InitialiserContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#automaton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomaton(TAParser.AutomatonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locationType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clockType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionsType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionsType(TAParser.ActionsTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgesType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgesType(TAParser.EdgesTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(TAParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(TAParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(TAParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#cons_guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_guard(TAParser.Cons_guardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(TAParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSub(TAParser.SumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(TAParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExprq}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExprq(TAParser.FalseExprqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(TAParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(TAParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(TAParser.UnaryContext ctx);
}