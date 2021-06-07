package Model.Types;

public class Number extends Value {
    private double value;

    public Number(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean isTrue() {
        return this.value!=0;
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
    public Value mul(Value valueMul) throws TypeException {

        if(!(valueMul instanceof Number)){
            throw new TypeException("Type error for binary operator *. A value is not a number");
        }
        return new Number(this.value*((Number) valueMul).value);
    }

    @Override
    public Value div(Value valueDiv) throws TypeException {
        if(!(valueDiv instanceof Number)){
            throw new TypeException("Type error for binary operator /. A value is not a number");
        }
        if(((Number) valueDiv).getValue()!=0){
            throw new ArithmeticException("The divisor is zero");
        }
        return new Number(this.value/((Number) valueDiv).value);
    }

    @Override
    public Value sum(Value valueSum) throws TypeException {
        if(!(valueSum instanceof Number)){
            throw new TypeException("Type error for binary operator *. A value is not a number");
        }
        return new Number(this.value+((Number) valueSum).value);
    }

    @Override
    public Value sub(Value valueSub) throws TypeException {
        if(!(valueSub instanceof Number)){
            throw new TypeException("Type error for binary operator -. A value is not a number");
        }
        return new Number(this.value-((Number) valueSub).value);
    }

    @Override
    public Value greater(Value valCompare) throws TypeException {
        if(!(valCompare instanceof Number)){
            throw new TypeException("Type error for binary operator >=. A value is not a number");
        }
        double leftNum = this.getValue();
        double rightNum = ((Number) valCompare).getValue();
        double newNum = (leftNum >= rightNum)? 1d : 0d;
        return new Number(newNum);
    }

    @Override
    public Value less(Value valCompare) throws TypeException {
        if(!(valCompare instanceof Number)){
            throw new TypeException("Type error for binary operator <=. A value is not a number");
        }
        double leftNum = this.getValue();
        double rightNum = ((Number) valCompare).getValue();
        double newNum = (leftNum <= rightNum)? 1d : 0d;
        return new Number(newNum);
    }
}
