package Model.Types;


import Model.Errors.TypeException;

public abstract class Value {

    public abstract boolean isTrue();
    public abstract boolean isFunction();
    public abstract boolean isNumber();

    public abstract Value mul(Value valMul) ;
    public abstract Value sum(Value valSum) ;
    public abstract Value sub(Value valSub) ;

    public abstract Value greater(Value valGreater) ;
    public abstract Value less(Value valLess) ;

    public abstract Value apply(Value[] values);
}
