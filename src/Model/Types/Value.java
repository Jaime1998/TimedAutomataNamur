package Model.Types;


import Model.Errors.TypeException;

public abstract class Value {

    public abstract boolean toBoolean();
    public abstract boolean isFunction();
    public abstract boolean isNumber();

    public abstract Value mul(Value valMul) ;
    public abstract Clock mul(Clock clock) ;
    public abstract Value sum(Value valSum) ;
    public abstract Value sum(Clock clock) ;
    public abstract Value sub(Value valSub) ;
    public abstract Value sub(Clock clock) ;

    public abstract Value greater(Value valGreater) ;
    public abstract Value less(Value valLess) ;

    public abstract Value apply(Value[] values);
}
