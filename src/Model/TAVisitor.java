package Model;

import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import Model.Types.Lambda;
import Model.Types.Number;
import Model.Errors.TypeException;
import Model.Types.Value;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class TAVisitor extends TAParserBaseVisitor<Value> {

    private TANetwork automata;

    private Automaton currentAutomaton;
    private Random rand = new Random();

    public TAVisitor(){
        this.automata = new TANetwork();
    }

    public TANetwork getAutomata(){
        return this.automata;
    }

    @Override
    public Value visitModel(TAParser.ModelContext ctx) {
        //Value let = visit(ctx.let());
        visit(ctx.block());
        Value automaton = visitAutomaton(ctx.automaton());
        return new Number(1);
    }

    @Override
    public Value visitBlock(TAParser.BlockContext ctx) {
        List<TAParser.StatementContext> statements = ctx.statement();
        for(TAParser.StatementContext statement: statements){
            visit(statement);
        }
        return new Number(1);
    }

    @Override
    public Value visitVarDeclarationSt(TAParser.VarDeclarationStContext ctx) {
        visit(ctx.varDeclaration());
        return new Number(1);
    }

    @Override
    public Value visitExprSt(TAParser.ExprStContext ctx) {
        return super.visitExprSt(ctx);
    }

    @Override
    public Value visitPrintSt(TAParser.PrintStContext ctx) {
        System.out.println(visit(ctx.expr()));
        return new Number(1);
    }

    @Override
    public Value visitNumVarDecl(TAParser.NumVarDeclContext ctx) {

        List<TAParser.VarIdContext> varsId = ctx.varId();

        for(TAParser.VarIdContext varId: varsId){

            Value newValue = visit(varId);

            if(newValue==null){
                this.automata.assignNewValue(varId.IDENTIFIER().getText(), new Number(0));
                continue;
            }
            if(!(newValue instanceof Number)){
                throw new TypeException("Type error. incompatible types");
            }
            this.automata.assignNewValue(varId.IDENTIFIER().getText(), newValue);
        }

        return new Number(1);
    }

    @Override
    public Value visitFuncVarDecl(TAParser.FuncVarDeclContext ctx) {
        List<TAParser.VarIdContext> varsId = ctx.varId();

        for(TAParser.VarIdContext varId: varsId){
            Value newValue = visit(varId);
            if(newValue==null){
                this.automata.assignNewValue(varId.IDENTIFIER().getText(), new Lambda());
                continue;
            }
            if(!(newValue instanceof Lambda)){
                throw new TypeException("Type error. incompatible types");
            }
            this.automata.assignNewValue(varId.IDENTIFIER().getText(), newValue);
        }
        return new Number(1);
    }

    @Override
    public Value visitType(TAParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Value visitVarId(TAParser.VarIdContext ctx) {
        return visit(ctx.initialiser());
    }

    @Override
    public Value visitInitialiser(TAParser.InitialiserContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Value visitAutomaton(TAParser.AutomatonContext ctx) {
        String nameAutomaton = ctx.IDENTIFIER().getText();

        this.currentAutomaton = this.automata.addAutomaton(nameAutomaton);

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

        visit(ctx.block());

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
        return new Number(1);
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
                this.currentAutomaton.setClockRate(nameLocation, nameClock, ((Number) newRate).getNumberValue());
            }
        }
        return new Number(1);
    }

    @Override
    public Value visitEdge(TAParser.EdgeContext ctx) {
        List<TerminalNode> ids = ctx.IDENTIFIER();

        String nameSource = ctx.IDENTIFIER(0).getText();
        String nameAction = ctx.IDENTIFIER(1).getText();

        HashSet<String> resetClocks = new HashSet<>();
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
                return left.sum(right);
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

        return this.automata.getValue(ctx.IDENTIFIER().getText());
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
        Value newValue = visit(ctx.expr());
        return this.automata.updateValue(ctx.IDENTIFIER().getText(), newValue);
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
