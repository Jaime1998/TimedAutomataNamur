package Model;

import Model.Errors.NoFindSymbolException;
import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import Model.Types.Clock;
import Model.Types.Number;
import Model.Types.Value;
import ilog.concert.IloNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GuardVisitor extends TAParserBaseVisitor<Object> {
    private IloCplex cplex;
    private HashMap<String, Value> localMemory;
    private HashMap<String, Value> globalMemory;
    private IloNumVar d;

    private final HashMap<String, Clock> clocks;
    private final HashSet<String> resetClocks;

    public GuardVisitor(IloCplex cplex,
                        IloNumVar d,
                        HashMap<String, Value> localMemory,
                        HashMap<String, Value> globalMemory,
                        HashMap<String, Clock> clocks,
                        HashSet<String> resetClocks){
        this.cplex = cplex;
        this.localMemory = localMemory;
        this.globalMemory = globalMemory;
        this.d = d;
        this.clocks = clocks;
        this.resetClocks = resetClocks;
    }

    public Value getValue(String id){
        Value v;
        v = this.localMemory.get(id);
        if(v!=null){
            return v;
        }
        v = this.globalMemory.get(id);
        if(v!=null){
            return v;
        }
        throw new NoFindSymbolException(id);
    }

    @Override
    public Object visitGuard(TAParser.GuardContext ctx) {

        List<TAParser.ConsGuardContext> guardList = ctx.consGuard();

        for (TAParser.ConsGuardContext guardCtx: guardList){
            Object visitedGuard = visit(guardCtx);

            if(visitedGuard instanceof Number){
                if(((Number) visitedGuard).getNumberValue() == 0){
                    return new Number(0);
                }
            }
        }

        return new Number(1);
    }

    @Override
    public Object visitConsGuard(TAParser.ConsGuardContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitCompareExpr(TAParser.CompareExprContext ctx) {
        try {
            Object left = visit(ctx.expr(0));
            Object right = visit(ctx.expr(1));

            if(ctx.op.getType() == TAParser.LESS_EQ ){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).less((Number)right);
                }
                if(left instanceof Number){
                    return cplex.addLe(((Number)left).getNumberValue(), (IloNumExpr) right);
                }
                if(right instanceof Number){
                    return cplex.addLe((IloNumExpr) left, ((Number)right).getNumberValue());
                }
                return cplex.addLe((IloNumExpr) left, (IloNumExpr) right);
            }
            if(ctx.op.getType() == TAParser.GREATER_EQ){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).greater((Number)right);
                }
                if(left instanceof Number){
                    return cplex.addGe(((Number)left).getNumberValue(), (IloNumExpr) right);
                }
                if(right instanceof Number){
                    return cplex.addGe((IloNumExpr) left, ((Number)right).getNumberValue());
                }
                return cplex.addGe((IloNumExpr) left, (IloNumExpr) right);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(1);
    }

    @Override
    public Object visitUnary(TAParser.UnaryContext ctx) {
        try {
            Object expression = visit(ctx.expr());
            if(expression instanceof Number){
                return new Number(((Number)expression).getNumberValue()*-1);
            }
            return cplex.prod((IloNumExpr)expression, -1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(1);
    }

    @Override
    public Object visitMul(TAParser.MulContext ctx) {
        try {
            Object left = visit(ctx.expr(0));
            Object right = visit(ctx.expr(1));

            if(left instanceof Number && right instanceof Number){
                return ((Number)left).mul((Number)right);
            }
            if(left instanceof Number){
                return cplex.prod(((Number)left).getNumberValue(), (IloNumExpr)right);
            }
            if(right instanceof Number){
                return cplex.prod((IloNumExpr)left, ((Number)right).getNumberValue());
            }
            return cplex.prod((IloNumExpr) left, (IloNumExpr) right);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(1);
    }

    @Override
    public Object visitAddSub(TAParser.AddSubContext ctx) {
        try {
            Object left = visit(ctx.expr(0));
            Object right = visit(ctx.expr(1));

            if(ctx.op.getType() == TAParser.ADD ){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).sum((Number)right);
                }
                if(left instanceof Number){
                    return cplex.sum(((Number)left).getNumberValue(), (IloNumExpr)right);
                }
                if(right instanceof Number){
                    return cplex.sum((IloNumExpr) left, ((Number)right).getNumberValue());
                }
                return cplex.sum((IloNumExpr) left, (IloNumExpr) right);

            }
            if(ctx.op.getType() == TAParser.SUB){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).sub((Number)right);
                }
                if(left instanceof Number){
                    return cplex.diff(((Number)left).getNumberValue(), (IloNumExpr) right);
                }
                if(right instanceof Number){
                    return cplex.diff((IloNumExpr) left, ((Number) right).getNumberValue());
                }
                return cplex.diff((IloNumExpr) left, (IloNumExpr) right);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(1);
    }

    @Override
    public Object visitDoubleExpr(TAParser.DoubleExprContext ctx) {
        double num = Double.parseDouble(ctx.DOUBLE().getText());

        return new Number(num);
    }

    @Override
    public Object visitIdExpr(TAParser.IdExprContext ctx) {
        try{
            String nameId = ctx.IDENTIFIER().getText();

            if(this.clocks.containsKey(nameId)){
                System.out.println(this.resetClocks);
                if(this.resetClocks.contains(nameId)){
                    return new Number(0);
                }
                Clock clock = this.clocks.get(nameId);
                return this.cplex.sum(cplex.prod(d, clock.getRate()), clock.getCurrentValue());
            }

            return getValue(nameId);

        }catch (Exception e){
            e.printStackTrace();
        }

        return super.visitIdExpr(ctx);
    }

    @Override
    public Object visitParensExpr(TAParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitAssignExpr(TAParser.AssignExprContext ctx) {
        return super.visitAssignExpr(ctx);
    }
}
