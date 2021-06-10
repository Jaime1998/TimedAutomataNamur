package Model;

import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import Model.Types.Number;
import Model.Types.TypeException;
import Model.Types.Value;
import ilog.concert.IloNumExpr;
import ilog.concert.IloNumVar;
import ilog.concert.IloRange;
import ilog.cplex.IloCplex;

import java.util.HashMap;
import java.util.List;

public class GuardVisitor extends TAParserBaseVisitor<Object> {
    private IloCplex cplex;
    private HashMap<String, Clock> clocks;
    private IloNumVar d;

    public GuardVisitor(IloCplex cplex, IloNumVar d, HashMap<String, Clock> clocks){
        this.cplex = cplex;
        this.clocks = clocks;
        this.d = d;
    }

    @Override
    public Object visitGuard(TAParser.GuardContext ctx) {

        List<TAParser.ConsGuardContext> guardList = ctx.consGuard();

        for (TAParser.ConsGuardContext guardCtx: guardList){
            visit(guardCtx);
        }
        return new Number(0);
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
                    return cplex.addLe(((Number)left).getValue(), (IloNumExpr) right);
                }
                if(right instanceof Number){
                    return cplex.addLe((IloNumExpr) left, ((Number)right).getValue());
                }
                return cplex.addLe((IloNumExpr) left, (IloNumExpr) right);
            }
            if(ctx.op.getType() == TAParser.GREATER_EQ){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).greater((Number)right);
                }
                if(left instanceof Number){
                    return cplex.addGe(((Number)left).getValue(), (IloNumExpr) right);
                }
                if(right instanceof Number){
                    return cplex.addGe((IloNumExpr) left, ((Number)right).getValue());
                }
                return cplex.addGe((IloNumExpr) left, (IloNumExpr) right);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Object visitUnary(TAParser.UnaryContext ctx) {
        try {
            Object expression = visit(ctx.expr());
            if(expression instanceof Number){
                return new Number(((Number)expression).getValue()*-1);
            }
            return  cplex.prod((IloNumExpr)expression, -1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(0);
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
                return cplex.prod(((Number)left).getValue(), (IloNumExpr)right);
            }
            if(right instanceof Number){
                return cplex.prod((IloNumExpr)left, ((Number)right).getValue());
            }
            return cplex.prod((IloNumExpr) left, (IloNumExpr) right);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(0);
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
                    return cplex.sum(((Number)left).getValue(), (IloNumExpr)right);
                }
                if(right instanceof Number){
                    return cplex.sum((IloNumExpr) left, ((Number)right).getValue());
                }
                return cplex.sum((IloNumExpr) left, (IloNumExpr) right);

            }
            if(ctx.op.getType() == TAParser.SUB){
                if(left instanceof Number && right instanceof Number){
                    return ((Number)left).sub((Number)right);
                }
                if(left instanceof Number){
                    return cplex.sum(((Number)left).getValue(), cplex.prod((IloNumExpr)right, -1));
                }
                if(right instanceof Number){
                    return cplex.sum((IloNumExpr) left, ((Number)right).getValue()*-1);
                }
                return cplex.sum((IloNumExpr) left, cplex.prod((IloNumExpr) right, -1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Number(0);
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
            Clock clock = this.clocks.get(nameId);
            if(clock!=null){
                System.out.println("Reloj con valor "+clock.getCurrentValue() + " y rate "+clock.getRate());
                return this.cplex.sum(cplex.prod(d, clock.getRate()), clock.getCurrentValue());
            }
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
