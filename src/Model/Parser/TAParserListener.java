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
	 * Enter a parse tree produced by {@link TAParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TAParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TAParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(TAParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(TAParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclarationSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationSt(TAParser.VarDeclarationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclarationSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationSt(TAParser.VarDeclarationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExprSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNumExprSt(TAParser.NumExprStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExprSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNumExprSt(TAParser.NumExprStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintSt(TAParser.PrintStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintSt(TAParser.PrintStContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(TAParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(TAParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(TAParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(TAParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TAParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TAParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(TAParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(TAParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(TAParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(TAParser.InitialiserContext ctx);
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
	 * Enter a parse tree produced by the {@code locationType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void enterLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locationType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void exitLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clockType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void enterClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clockType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void exitClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionsType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void enterActionsType(TAParser.ActionsTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionsType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void exitActionsType(TAParser.ActionsTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgesType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void enterEdgesType(TAParser.EdgesTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgesType}
	 * labeled alternative in {@link TAParser#types_TA}.
	 * @param ctx the parse tree
	 */
	void exitEdgesType(TAParser.EdgesTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(TAParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(TAParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(TAParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(TAParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(TAParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(TAParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#cons_guard}.
	 * @param ctx the parse tree
	 */
	void enterCons_guard(TAParser.Cons_guardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#cons_guard}.
	 * @param ctx the parse tree
	 */
	void exitCons_guard(TAParser.Cons_guardContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(TAParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(TAParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameters(TAParser.FuncParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameters(TAParser.FuncParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameter(TAParser.FuncParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameter(TAParser.FuncParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TAParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TAParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(TAParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(TAParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(TAParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(TAParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(TAParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(TAParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(TAParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(TAParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(TAParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(TAParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(TAParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(TAParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(TAParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TAParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(TAParser.AssignExprContext ctx);
}