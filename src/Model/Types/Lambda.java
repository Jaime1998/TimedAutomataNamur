package Model.Types;

import Model.Parser.TAParser;

import java.util.List;
import java.util.function.Function;

public class Lambda extends Value {
    private final String[] types;
    private final String[] identifiers;
    private final TAParser.BlockContext body;

    public Lambda(List<String> typesList, List<String> identifiersList, TAParser.BlockContext body){
        this.types = new String[typesList.size()];
        typesList.toArray(this.types);

        this.identifiers = new String[identifiersList.size()];
        identifiersList.toArray(this.identifiers);

        this.body = body;
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
    public boolean isTrue() {
        return true;
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
    public Value mul(Value valMul) throws TypeException {
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    @Override
    public Value div(Value valDiv) throws TypeException {
        throw new TypeException("Type error for binary operator /. A value is not a number");
    }

    @Override
    public Value sum(Value valSum) throws TypeException {
        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    @Override
    public Value sub(Value valSub) throws TypeException {
        throw new TypeException("Type error for binary operator -. A value is not a number");
    }

    @Override
    public Value greater(Value valGreater) throws TypeException {
        throw new TypeException("Type error for binary operator >=. A value is not a number");
    }

    @Override
    public Value less(Value valLess) throws TypeException {
        throw new TypeException("Type error for binary operator <=. A value is not a number");
    }
}
