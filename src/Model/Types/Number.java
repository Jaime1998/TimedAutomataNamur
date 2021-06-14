package Model.Types;

import Model.Errors.NoFindSymbolException;
import Model.Errors.NoFunctionException;
import Model.Errors.TypeException;

public class Number extends Value {
    private double numberValue;

    public Number(double numberValue){
        this.numberValue = numberValue;
    }

    public double getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(double numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public boolean isTrue() {
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

        if(!(valueMul instanceof Number)){
            throw new TypeException("Type error for binary operator *. A value is not a number");
        }
        return new Number(this.numberValue *((Number) valueMul).numberValue);
    }

    @Override
    public Value div(Value valueDiv)  {
        if(!(valueDiv instanceof Number)){
            throw new TypeException("Type error for binary operator /. A value is not a number");
        }
        if(((Number) valueDiv).getNumberValue()!=0){
            throw new ArithmeticException("The divisor is zero");
        }
        return new Number(this.numberValue /((Number) valueDiv).numberValue);
    }

    @Override
    public Value sum(Value valueSum) {
        if(!(valueSum instanceof Number)){
            throw new TypeException("Type error for binary operator *. A value is not a number");
        }
        return new Number(this.numberValue +((Number) valueSum).numberValue);
    }

    @Override
    public Value sub(Value valueSub) {
        if(!(valueSub instanceof Number)){
            throw new TypeException("Type error for binary operator -. A value is not a number");
        }
        return new Number(this.numberValue -((Number) valueSub).numberValue);
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
}
