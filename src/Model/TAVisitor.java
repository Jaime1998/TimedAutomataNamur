package Model;

import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import Model.Types.Number;
import Model.Types.TypeException;
import Model.Types.Value;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TAVisitor extends TAParserBaseVisitor<Value> {

    private HashMap<String, Clock> clockEnv;
    private HashMap<String, String> actionsEnv;
    /**
    private HashMap<String, Double> numEnv;
    private HashMap<String, Function<String, ?>> funcNumEnv;
     */

    private List<HashMap<String, Value>> memory;

    public TAVisitor(){
        this.clockEnv = new HashMap<>();
        this.actionsEnv = new HashMap<>();
        this.memory = new ArrayList<>();
        this.memory.add(new HashMap<>());
    }

    public double lookUpValueClock(String idClock){
        try{
            return clockEnv.get(idClock).getCurrentValue();
        }catch (NullPointerException e){
            return -1;
        }
    }

    public double lookUpAction(String idAction){
        return actionsEnv.containsKey(idAction)? 1d: 0d;
    }

    @Override
    public Value visitModel(TAParser.ModelContext ctx) {
        Value let = visit(ctx.let());
        Value automaton = visitAutomaton(ctx.automaton());
        return new Number(0);
    }

    @Override
    public Value visitBlock(TAParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Value visitLet(TAParser.LetContext ctx) {
        List<TAParser.StatementContext> statements = ctx.statement();

        for(TAParser.StatementContext stm: statements){
            visit(stm);
        }

        return new Number(0);
    }

    @Override
    public Value visitVarDeclarationSt(TAParser.VarDeclarationStContext ctx) {
        return super.visitVarDeclarationSt(ctx);
    }

    @Override
    public Value visitNumExprSt(TAParser.NumExprStContext ctx) {
        return super.visitNumExprSt(ctx);
    }

    @Override
    public Value visitPrintSt(TAParser.PrintStContext ctx) {
        return super.visitPrintSt(ctx);
    }

    @Override
    public Value visitPrintStatement(TAParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Value visitVarDeclaration(TAParser.VarDeclarationContext ctx) {
        return super.visitVarDeclaration(ctx);
    }

    @Override
    public Value visitType(TAParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Value visitVarId(TAParser.VarIdContext ctx) {
        return super.visitVarId(ctx);
    }

    @Override
    public Value visitInitialiser(TAParser.InitialiserContext ctx) {
        return super.visitInitialiser(ctx);
    }

    @Override
    public Value visitAutomaton(TAParser.AutomatonContext ctx) {
        return super.visitAutomaton(ctx);
    }

    @Override
    public Value visitLocationType(TAParser.LocationTypeContext ctx) {
        return super.visitLocationType(ctx);
    }

    @Override
    public Value visitClockType(TAParser.ClockTypeContext ctx) {
        return super.visitClockType(ctx);
    }

    @Override
    public Value visitActionsType(TAParser.ActionsTypeContext ctx) {
        return super.visitActionsType(ctx);
    }

    @Override
    public Value visitEdgesType(TAParser.EdgesTypeContext ctx) {
        return super.visitEdgesType(ctx);
    }

    @Override
    public Value visitLocation(TAParser.LocationContext ctx) {
        return super.visitLocation(ctx);
    }

    @Override
    public Value visitEdge(TAParser.EdgeContext ctx) {
        return super.visitEdge(ctx);
    }

    @Override
    public Value visitGuard(TAParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public Value visitCons_guard(TAParser.Cons_guardContext ctx) {
        return super.visitCons_guard(ctx);
    }

    @Override
    public Value visitFuncExpr(TAParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public Value visitFuncParameters(TAParser.FuncParametersContext ctx) {
        return super.visitFuncParameters(ctx);
    }

    @Override
    public Value visitFuncParameter(TAParser.FuncParameterContext ctx) {
        return super.visitFuncParameter(ctx);
    }

    @Override
    public Value visitArguments(TAParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public Value visitDoubleExpr(TAParser.DoubleExprContext ctx) {
        double num = Double.parseDouble(ctx.DOUBLE().getText());
        return new Number(num);
    }

    @Override
    public Value visitAddSub(TAParser.AddSubContext ctx) {
        try {
            Value left = visit(ctx.numExpr(0));
            Value right = visit(ctx.numExpr(1));

            if(ctx.op.getType() == TAParser.ADD){
                return left.mul(right);
            }
            if(ctx.op.getType() == TAParser.SUB){
                return left.div(right);
            }
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitIdExpr(TAParser.IdExprContext ctx) {
        return lookUpMemory(ctx.IDENTIFIER(), ctx);
    }

    @Override
    public Value visitMulDiv(TAParser.MulDivContext ctx) {
        try {
            Value left = visit(ctx.numExpr(0));
            Value right = visit(ctx.numExpr(1));

            if(ctx.op.getType() == TAParser.MUL){
                return left.mul(right);
            }
            if(ctx.op.getType() == TAParser.DIV){
                return left.div(right);
            }
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitCompareExpr(TAParser.CompareExprContext ctx) {
        try {
            Value left = visit(ctx.numExpr(0));
            Value right = visit(ctx.numExpr(1));

            if(ctx.op.getType() == TAParser.GREATER_EQ){
                return left.greater(right);
            }
            if(ctx.op.getType() == TAParser.LESS_EQ){
                return left.greater(right);
            }
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitParensExpr(TAParser.ParensExprContext ctx) {
        return visit(ctx.numExpr());
    }

    @Override
    public Value visitUnary(TAParser.UnaryContext ctx) {
        try {
            if(ctx.op.getType() == TAParser.SUB){
                return visit(ctx.numExpr()).mul(new Number(-1));
            }
            return visit(ctx.numExpr());
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitAssignExpr(TAParser.AssignExprContext ctx) {
        Value oldValue =  lookUpMemory(ctx.IDENTIFIER(), ctx);
        if(oldValue==null){
            return new Number(0);
        }
        Value newValue = visit(ctx.numExpr());
        return 
    }

    private Value lookUpMemory(TerminalNode identifier, TAParser.AssignExprContext ctx) {
        String id = identifier.getText();
        for(int i=this.memory.size()-1; i>=0; i--){
            Value num = this.memory.get(i).get(id);
            if(num!=null){
                return num;
            }
        }
        return new Number(0);
    }


}
