package Model;

import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;

import java.util.HashMap;

public class TAVisitor extends TAParserBaseVisitor<Double> {

    private HashMap<String, Clock> clockEnv;
    private HashMap<String, String> actionsEnv;
    private HashMap<String, Double> numEnv;

    @Override
    public Double visitModel(TAParser.ModelContext ctx) {
        return super.visitModel(ctx);
    }

    @Override
    public Double visitLet(TAParser.LetContext ctx) {
        return super.visitLet(ctx);
    }

    @Override
    public Double visitDeclaration(TAParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public Double visitVarDeclaration(TAParser.VarDeclarationContext ctx) {
        return super.visitVarDeclaration(ctx);
    }

    @Override
    public Double visitType(TAParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Double visitVarId(TAParser.VarIdContext ctx) {
        return super.visitVarId(ctx);
    }

    @Override
    public Double visitInitialiser(TAParser.InitialiserContext ctx) {
        return super.visitInitialiser(ctx);
    }

    @Override
    public Double visitAutomaton(TAParser.AutomatonContext ctx) {
        return super.visitAutomaton(ctx);
    }

    @Override
    public Double visitLocationType(TAParser.LocationTypeContext ctx) {
        return super.visitLocationType(ctx);
    }

    @Override
    public Double visitClockType(TAParser.ClockTypeContext ctx) {
        return super.visitClockType(ctx);
    }

    @Override
    public Double visitActionsType(TAParser.ActionsTypeContext ctx) {
        return super.visitActionsType(ctx);
    }

    @Override
    public Double visitEdgesType(TAParser.EdgesTypeContext ctx) {
        return super.visitEdgesType(ctx);
    }

    @Override
    public Double visitLocation(TAParser.LocationContext ctx) {
        return super.visitLocation(ctx);
    }

    @Override
    public Double visitEdge(TAParser.EdgeContext ctx) {
        return super.visitEdge(ctx);
    }

    @Override
    public Double visitGuard(TAParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public Double visitCons_guard(TAParser.Cons_guardContext ctx) {
        return super.visitCons_guard(ctx);
    }

    @Override
    public Double visitDoubleExpr(TAParser.DoubleExprContext ctx) {
        return super.visitDoubleExpr(ctx);
    }

    @Override
    public Double visitSumSub(TAParser.SumSubContext ctx) {
        return super.visitSumSub(ctx);
    }

    @Override
    public Double visitTrueExpr(TAParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }
    
    @Override
    public Double visitIdExpr(TAParser.IdExprContext ctx) {
        String idExpr = ctx.IDENTIFIER().getText();
        return numEnv.get(idExpr);
    }

    @Override
    public Double visitFalseExprq(TAParser.FalseExprqContext ctx) {
        return super.visitFalseExprq(ctx);
    }

    @Override
    public Double visitMulDiv(TAParser.MulDivContext ctx) {
        return super.visitMulDiv(ctx);
    }

    @Override
    public Double visitCompareExpr(TAParser.CompareExprContext ctx) {
        return super.visitCompareExpr(ctx);
    }

    @Override
    public Double visitParensExpr(TAParser.ParensExprContext ctx) {
        return super.visitParensExpr(ctx);
    }

    @Override
    public Double visitUnary(TAParser.UnaryContext ctx) {
        return super.visitUnary(ctx);
    }
}
