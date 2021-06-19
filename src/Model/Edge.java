package Model;

import Model.Parser.TAParser;

import java.util.ArrayList;
import java.util.HashSet;

public class Edge {
    private final TAParser.GuardContext guard;
    private Interval guardInterval;
    private final String action;
    private final HashSet<String> resetClocks;
    private final Location target;

    public Edge(TAParser.GuardContext guard, String action, HashSet<String> resetClocks, Location target){
        this.guard = guard;
        this.guardInterval = null;
        this.action = action;
        this.resetClocks = resetClocks;
        this.target = target;
    }

    public TAParser.GuardContext getGuard() {
        return guard;
    }

    public Interval getGuardInterval(){
        return this.guardInterval;
    }

    public void setGuardInterval(Interval guardInterval) {
        this.guardInterval = guardInterval;
    }

    public String getAction(){
        return this.action;
    }

    public HashSet<String> getResetClocks() {
        return resetClocks;
    }

    public Location getTarget() {
        return target;
    }

    @Override
    public String toString() {
        String output = "";
        output = this.guardInterval.toString();
        output = output.concat(", ");
        output = output.concat(this.action);
        output = output.concat(", ");
        output = output.concat("{");
        String separator = "";
        for(String resetClock: this.resetClocks){
            output = output.concat(separator).concat(resetClock);
            separator = (", ");
        }
        output = output.concat("}");
        output = output.concat(", ");
        output = output.concat(this.target.getName());
        return output;
    }
}