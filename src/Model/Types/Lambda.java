package Model.Types;

import Model.Errors.TypeException;
import Model.Parser.TAParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lambda extends Value {
    //Types are: "number", "lambda"
    private final String[] types;
    private final String[] identifiers;
    private final ArrayList<HashMap<String, Value>> memory;
    private final TAParser.BlockContext body;

    public Lambda(List<String> typesList, List<String> identifiersList, TAParser.BlockContext body, ArrayList<HashMap<String, Value>> memory){
        this.types = new String[typesList.size()];
        typesList.toArray(this.types);

        this.identifiers = new String[identifiersList.size()];
        identifiersList.toArray(this.identifiers);

        this.body = body;

        this.memory = new ArrayList<>(memory);
    }

    public Lambda(){
        this.types= null;
        this.identifiers = null;
        this.memory = null;
        this.body = null;
    }

    public Lambda(Lambda lambdaIn){
        this.types = lambdaIn.types;
        this.identifiers = lambdaIn.identifiers;
        this.memory = lambdaIn.memory;
        this.body = lambdaIn.body;
    }

    public String[] getTypes() {
        return types;
    }

    public String[] getIdentifiers() {
        return identifiers;
    }

    public TAParser.BlockContext getBody() {
        return body;
    }

    @Override
    public boolean toBoolean() {
        return false;
    }

    @Override
    public boolean isFunction() {
        return true;
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public Value mul(Value valMul) {
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    @Override
    public Clock mul(Clock clock) {
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    @Override
    public Value sum(Value valSum) {
        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    @Override
    public Value sum(Clock clock) {
        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    @Override
    public Value sub(Value valSub) {
        throw new TypeException("Type error for binary operator -. A value is not a number");
    }

    @Override
    public Value sub(Clock clock) {
        throw new TypeException("Type error for binary operator -. A value is not a number");
    }

    @Override
    public Value greater(Value valGreater) {
        throw new TypeException("Type error for binary operator >=. A value is not a number");
    }

    @Override
    public Value less(Value valLess) {
        throw new TypeException("Type error for binary operator <=. A value is not a number");
    }

    @Override
    public Value apply(Value[] values) {

        if(body == null){
            throw new TypeException("The function was not initialised");
        }
        this.memory.add(new HashMap<>());
        int lastEnv = this.memory.size()-1;
        for(int i = 0; i<this.identifiers.length; i++){
            this.memory.get(lastEnv).put(this.identifiers[i], values[i]);
        }

        return null;
    }
}
