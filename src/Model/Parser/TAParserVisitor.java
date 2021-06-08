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
	 * Visit a parse tree produced by {@link TAParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TAParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(TAParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationSt(TAParser.VarDeclarationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSt(TAParser.ExprStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSt(TAParser.PrintStContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TAParser.PrintStatementContext ctx);
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
	 * labeled alternative in {@link TAParser#typesTA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clockType}
	 * labeled alternative in {@link TAParser#typesTA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionsType}
	 * labeled alternative in {@link TAParser#typesTA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionsType(TAParser.ActionsTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgesType}
	 * labeled alternative in {@link TAParser#typesTA}.
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
	 * Visit a parse tree produced by {@link TAParser#consGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsGuard(TAParser.ConsGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(TAParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#funcParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameters(TAParser.FuncParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#funcParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameter(TAParser.FuncParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TAParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(TAParser.DoubleExprContext ctx);
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
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(TAParser.AddSubContext ctx);
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
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(TAParser.AssignExprContext ctx);
}