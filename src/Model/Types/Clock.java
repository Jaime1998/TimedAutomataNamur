package Model.Types;

import Model.Errors.TypeException;

public class Clock extends Value{

    private String name;
    private double rate;
    private double currentValue;

    public Clock(String name) {
        this.name = name;
        this.rate = 1;
        this.currentValue=0;
    }

    public Clock(String name, double rate, double currentValue) {
        this.name = name;
        this.rate = rate;
        this.currentValue = currentValue;
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public void increaseCurrentValue(double d) {
        this.currentValue += d;
    }

    public void resetValue(){
        this.currentValue = 0;
    }

    @Override
    public boolean toBoolean() {
        return false;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public Value mul(Value valMul) {
        if(valMul instanceof Number){
            return new Number(this.currentValue * ((Number)valMul).getNumberValue());
        }
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    @Override
    public Value sum(Value valSum) {
        if(valSum instanceof Number){
            return new Number(this.currentValue + ((Number) valSum).getNumberValue());
        }
        if(valSum instanceof Clock){
            return new Number(this.currentValue + ((Number) valSum).getNumberValue());
        }
        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    @Override
    public Value sub(Value valSub) {
        if(valSub instanceof Number){
            return new Number(this.currentValue - ((Number) valSub).getNumberValue());
        }
        if(valSub instanceof Clock){
            return new Number(this.currentValue - ((Number) valSub).getNumberValue());
        }
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
        return null;
    }
}
