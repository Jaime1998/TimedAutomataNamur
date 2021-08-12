package Model;

import java.util.ArrayList;

public class Interval {
    private double min;
    private double max;
    public Interval(double min, double max){
        if(min>max){
            this.min = Double.POSITIVE_INFINITY;
            this.max = Double.POSITIVE_INFINITY;
            return;
        }
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return this.min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return this.max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void reduceInterval(double d){

        if(d > this.max){
            this.min = Double.POSITIVE_INFINITY;
            this.max = Double.POSITIVE_INFINITY;
            return;
        }

        this.min = this.min - d;
        if(this.min < 0){
            this.min = 0;
        }
        this.max = this.max - d;
    }

    public Interval intersection(Interval intervalIn){
        return new Interval(Math.max(this.min, intervalIn.min),
                            Math.min(this.max, intervalIn.max));
    }

    public Interval intersection (ArrayList<Interval> intervals){
        return new Interval(1,2);
    }

    @Override
    public String toString() {
        String output = "[";
        output = output.concat(Double.toString(this.getMin()));
        output = output.concat(", ");
        output = output.concat(Double.toString(this.getMax()));
        output = output.concat("]");
        return output;
    }
}
