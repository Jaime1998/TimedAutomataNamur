package Model.Types;

import Model.Errors.TypeException;

public class Clock {

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
        this.currentValue += d*this.rate;
    }

    public void resetValue(){
        this.currentValue = 0;
    }


    public Value mul(Value valMul) {
        if(valMul instanceof Number){
            return new Number(this.currentValue * ((Number)valMul).getNumberValue());
        }
        throw new TypeException("Type error for binary operator *. A value is not a number");
    }

    public Value sum(Value valSum) {
        if(valSum instanceof Number){
            return new Number(this.currentValue + ((Number) valSum).getNumberValue());
        }
        throw new TypeException("Type error for binary operator +. A value is not a number");
    }

    public Value sub(Value valSub) {
        if(valSub instanceof Number){
            return new Number(this.currentValue - ((Number) valSub).getNumberValue());
        }
        throw new TypeException("Type error for binary operator -. A value is not a number");
    }

    public Value greater(Value valGreater) {
        throw new TypeException("Type error for binary operator >=. A value is not a number");
    }

    public Value less(Value valLess) {
        throw new TypeException("Type error for binary operator <=. A value is not a number");
    }

}
