package Model;

public class Clock {

    private String name;
    private int rate;
    private double currentValue;

    public Clock(String name){
        this.name = name;
        this.rate = 1;
        this.currentValue=0;
    }

    public String getName() {
        return this.name;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
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
}
