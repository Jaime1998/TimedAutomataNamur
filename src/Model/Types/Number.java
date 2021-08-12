package Model.Types;

import Model.Errors.NoFunctionException;
import Model.Errors.TypeException;

public class Number extends Value {
    private final double numberValue;

    public Number(double numberValue){
        this.numberValue = numberValue;
    }

    public double getNumberValue() {
        return numberValue;
    }


    @Override
    public boolean toBoolean() {
        return this.numberValue !=0;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isNumber() {
        return true;
    }

    @Override
    public Value mul(Value valueMul) {
        if(valueMul instanceof Number){
            return new Number(this.numberValue *((Number) valueMul).numberValue);
        }
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    @Override
    public Clock mul(Clock clock){
        return new Clock(clock.getName(),
                clock.getRate() * this.numberValue,
                clock.getCurrentValue());
    }

    @Override
    public Value sum(Value valueSum) {

        if(valueSum instanceof Number){
            return new Number(this.numberValue +((Number) valueSum).numberValue);
        }

        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    @Override
    public Value sum(Clock clock) {
        return new Number(this.numberValue+ (clock.getCurrentValue()));
    }

    @Override
    public Value sub(Value valueSub) {
        if(valueSub instanceof Number){
            return new Number(this.numberValue -((Number) valueSub).numberValue);
        }
        throw new TypeException("Type error for binary operator -. A value is not a number");

    }

    @Override
    public Value sub(Clock clock) {
        return new Number(this.numberValue -(clock.getCurrentValue()));
    }

    @Override
    public Value greater(Value valCompare) {
        if(!(valCompare instanceof Number)){
            throw new TypeException("Type error for binary operator >=. A value is not a number");
        }
        double leftNum = this.getNumberValue();
        double rightNum = ((Number) valCompare).getNumberValue();
        double newNum = (leftNum >= rightNum)? 1d : 0d;
        return new Number(newNum);
    }

    @Override
    public Value less(Value valCompare) {
        if(!(valCompare instanceof Number)){
            throw new TypeException("Type error for binary operator <=. A value is not a number");
        }
        double leftNum = this.getNumberValue();
        double rightNum = ((Number) valCompare).getNumberValue();
        double newNum = (leftNum <= rightNum)? 1d : 0d;
        return new Number(newNum);
    }

    @Override
    public Value apply(Value[] values){
        throw new NoFunctionException();
    }

    @Override
    public String toString() {
        return Double.toString(this.numberValue);
    }
}
