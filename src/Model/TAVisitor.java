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

    private TANetwork automata;

    private Automaton currentAutomaton;

    public TAVisitor(){
        this.automata = new TANetwork();
    }

    public TANetwork getAutomata(){
        return this.automata;
    }

    @Override
    public Value visitModel(TAParser.ModelContext ctx) {
        //Value let = visit(ctx.let());
        if(ctx.let() != null){
            Value let = visit(ctx.let());
        }
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
    public Value visitExprSt(TAParser.ExprStContext ctx) {
        return super.visitExprSt(ctx);
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
        String nameAutomaton = ctx.IDENTIFIER().getText();
        this.currentAutomaton = new Automaton(nameAutomaton);
        this.automata.addAutomaton(this.currentAutomaton);



        List<TAParser.ClockTypeContext> clockList = ctx.clockType();

        for(TAParser.ClockTypeContext clock: clockList){
            visit(clock);
        }

        List<TAParser.LocationTypeContext> locationList = ctx.locationType();

        for(TAParser.LocationTypeContext location: locationList){
            visit(location);
        }

        List<TAParser.ActionTypeContext> actionList = ctx.actionType();

        for(TAParser.ActionTypeContext action: actionList){
            visit(action);
        }

        List<TAParser.EdgesTypeContext> edgeList = ctx.edgesType();

        for(TAParser.EdgesTypeContext edge: edgeList){
            visit(edge);
        }
        String initNameL = ctx.initLocation().IDENTIFIER().getText();
        this.currentAutomaton.setInitLocation(initNameL);
        Location initLocation = this.currentAutomaton.getLocation(initNameL);
        this.currentAutomaton.setCurrentLocation(initLocation);
        return new Number(1);
    }

    @Override
    public Value visitLocationType(TAParser.LocationTypeContext ctx) {
        List<TAParser.LocationContext> locationList = ctx.location();

        for(TAParser.LocationContext location: locationList){
            visit(location);
        }
        return new Number(1);
    }

    @Override
    public Value visitClockType(TAParser.ClockTypeContext ctx) {
        List<TerminalNode> clocks = ctx.IDENTIFIER();
        for(TerminalNode clock: clocks){
            this.currentAutomaton.putClock(clock.getText());
        }
        return new Number(1);
    }

    @Override
    public Value visitActionType(TAParser.ActionTypeContext ctx) {
        List<TerminalNode> actions = ctx.IDENTIFIER();
        for(TerminalNode action: actions){
            this.currentAutomaton.addAction(action.getText());
        }
        return new Number(1);
    }

    @Override
    public Value visitEdgesType(TAParser.EdgesTypeContext ctx) {
        List<TAParser.EdgeContext> edgesList = ctx.edge();

        for (TAParser.EdgeContext edge: edgesList){
            visit(edge);
        }
        return super.visitEdgesType(ctx);
    }

    @Override
    public Value visitLocation(TAParser.LocationContext ctx) {
        String nameLocation = ctx.IDENTIFIER(0).getText();
        TAParser.GuardContext newGuard = ctx.guard();
        Location newLocation = new Location(nameLocation, newGuard);
        this.currentAutomaton.addLocation(newLocation);

        List<TerminalNode> clockRates = ctx.IDENTIFIER();


        for(int i=1; i<clockRates.size(); i++){
            String nameClock = clockRates.get(i).getText();
            Value newRate = visit(ctx.expr(i-1));
            if(newRate instanceof Number){
                this.currentAutomaton.setClockRate(nameClock, ((Number) newRate).getValue());
            }
            else{
                this.currentAutomaton.setClockRate(nameClock, 1);
            }
        }
        return new Number(1);
    }

    @Override
    public Value visitEdge(TAParser.EdgeContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();

        String nameSource = ctx.IDENTIFIER(0).getText();
        String nameAction = ctx.IDENTIFIER(1).getText();

        ArrayList<String> resetClocks = new ArrayList<>();
        for(int i=2; i<ids.size()-1; i++){
            resetClocks.add(ids.get(i).getText());
        }

        String nameTarget = ctx.IDENTIFIER(ids.size()-1).getText();
        Location target = this.currentAutomaton.getLocation(nameTarget);

        if(ctx.guard()!=null){
            TAParser.GuardContext guard = ctx.guard();
            this.currentAutomaton.getLocation(nameSource).addEdge(guard, nameAction, resetClocks, target);
        }
        else{
            this.currentAutomaton.getLocation(nameSource).addEdge(null, nameAction, resetClocks, target);
        }
        return new Number(1);
    }

    @Override
    public Value visitGuard(TAParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public Value visitConsGuard(TAParser.ConsGuardContext ctx) {
        return super.visitConsGuard(ctx);
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
            Value left = visit(ctx.expr(0));
            Value right = visit(ctx.expr(1));

            if(ctx.op.getType() == TAParser.ADD){
                return left.mul(right);
            }
            if(ctx.op.getType() == TAParser.SUB){
                return left.sub(right);
            }
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitIdExpr(TAParser.IdExprContext ctx) {
        return lookUpMemory(ctx.IDENTIFIER().getText());
    }

    @Override
    public Value visitMul(TAParser.MulContext ctx) {
        try {
            Value left = visit(ctx.expr(0));
            Value right = visit(ctx.expr(1));

                return left.mul(right);

        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitCompareExpr(TAParser.CompareExprContext ctx) {
        try {
            Value left = visit(ctx.expr(0));
            Value right = visit(ctx.expr(1));

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
        return visit(ctx.expr());
    }

    @Override
    public Value visitUnary(TAParser.UnaryContext ctx) {
        try {
            if(ctx.op.getType() == TAParser.SUB){
                return visit(ctx.expr()).mul(new Number(-1));
            }
            return visit(ctx.expr());
        }catch (TypeException e){
            e.printStackTrace();
        }
        return new Number(0);
    }

    @Override
    public Value visitAssignExpr(TAParser.AssignExprContext ctx) {
        //Value oldValue =  lookUpMemory(ctx.IDENTIFIER());
        Value newValue = visit(ctx.expr());
        return newValue;
    }

    private Value lookUpMemory(String id){


        return this.automata.getValue(id);
    }

    /*
    private Value lookUpMemory(TerminalNode identifier) {
        String id = identifier.getText();
        for(int i=this.automata.get.size()-1; i>=0; i--){
            Value num = this.memory.get(i).get(id);
            if(num!=null){
                return num;
            }
        }
        return new Number(0);
    }

     */


}
