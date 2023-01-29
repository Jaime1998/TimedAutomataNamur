// Generated from C:/Users/Jaime/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/src/Model/Parser\TAParser.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code ExprSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprSt(TAParser.ExprStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprSt(TAParser.ExprStContext ctx);
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
	 * Enter a parse tree produced by the {@code ReturnSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnSt(TAParser.ReturnStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnSt}
	 * labeled alternative in {@link TAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnSt(TAParser.ReturnStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVarDecl}
	 * labeled alternative in {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNumVarDecl(TAParser.NumVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVarDecl}
	 * labeled alternative in {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNumVarDecl(TAParser.NumVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncVarDecl}
	 * labeled alternative in {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncVarDecl(TAParser.FuncVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncVarDecl}
	 * labeled alternative in {@link TAParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncVarDecl(TAParser.FuncVarDeclContext ctx);
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
	 * Enter a parse tree produced by {@link TAParser#locationType}.
	 * @param ctx the parse tree
	 */
	void enterLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#locationType}.
	 * @param ctx the parse tree
	 */
	void exitLocationType(TAParser.LocationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#clockType}.
	 * @param ctx the parse tree
	 */
	void enterClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#clockType}.
	 * @param ctx the parse tree
	 */
	void exitClockType(TAParser.ClockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(TAParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(TAParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TAParser#edgesType}.
	 * @param ctx the parse tree
	 */
	void enterEdgesType(TAParser.EdgesTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#edgesType}.
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
	 * Enter a parse tree produced by {@link TAParser#initLocation}.
	 * @param ctx the parse tree
	 */
	void enterInitLocation(TAParser.InitLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#initLocation}.
	 * @param ctx the parse tree
	 */
	void exitInitLocation(TAParser.InitLocationContext ctx);
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
	 * Enter a parse tree produced by {@link TAParser#consGuard}.
	 * @param ctx the parse tree
	 */
	void enterConsGuard(TAParser.ConsGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TAParser#consGuard}.
	 * @param ctx the parse tree
	 */
	void exitConsGuard(TAParser.ConsGuardContext ctx);
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
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(TAParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(TAParser.DoubleExprContext ctx);
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
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(TAParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(TAParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(TAParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(TAParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(TAParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(TAParser.CompareExprContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code RateExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRateExpr(TAParser.RateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RateExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRateExpr(TAParser.RateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(TAParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(TAParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(TAParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(TAParser.AssignExprContext ctx);
}