package Model;

import Model.Parser.TAParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public class Location {

    private final String name;
    private final HashMap<String, Clock> clocks;
    private TAParser.GuardContext invariant;
    private ArrayList<TransToLocation> edges;

    public Location(String name, HashMap<String, Clock> clocks, TAParser.GuardContext invariant){
        this.name = name;
        this.clocks = clocks;
        this.invariant = invariant;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Clock> getClocks() {
        return clocks;
    }

    public TAParser.GuardContext getInvariant() {
        return invariant;
    }

    public void setInvariant(TAParser.GuardContext invariant) {
        this.invariant = invariant;
    }

    public ArrayList<TransToLocation> getEdges() {
        return this.edges;
    }

    public TAParser.GuardContext guardI(int i){
        return this.edges.get(i).getGuard();
    }
    public String actionI(int i){
        return this.edges.get(i).getAction();
    }
    public ArrayList<String> clocksToResetI(int i){
        return this.edges.get(i).getResetClocks();
    }
    public Location getTargetI(int i){
        return this.edges.get(i).getTarget();
    }

    private static class TransToLocation {
        private final TAParser.GuardContext guard;
        private final String action;
        private final ArrayList<String> resetClocks;
        private final Location target;

        public TransToLocation(TAParser.GuardContext guard, String action, ArrayList<String> resetClocks, Location target){
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

}