package Model;

import Model.Parser.TAParser;

import java.util.ArrayList;

public class Edge {
    private final TAParser.GuardContext guard;
    private Interval guardInterval;
    private final String action;
    private final ArrayList<String> resetClocks;
    private final Location target;

    public Edge(TAParser.GuardContext guard, String action, ArrayList<String> resetClocks, Location target){
        this.guard = guard;
        this.action = action;
        this.resetClocks = resetClocks;
        this.target = target;
    }

    public TAParser.GuardContext getGuard() {
        return guard;
    }

    public String getAction(){
        return this.action;
    }

    public ArrayList<String> getResetClocks() {
        return resetClocks;
    }

    public Location getTarget() {
        return target;
    }


}