package Model.Types;


public abstract class Value {

    public abstract boolean isTrue();
    public abstract boolean isFunction();
    public abstract boolean isNumber();

    public abstract Value mul(Value valMul) throws TypeException;
    public abstract Value div(Value valDiv) throws TypeException;
    public abstract Value sum(Value valSum) throws TypeException;
    public abstract Value sub(Value valSub) throws TypeException;

    public abstract Value greater(Value valGreater) throws TypeException;
    public abstract Value less(Value valLess) throws TypeException;
}
