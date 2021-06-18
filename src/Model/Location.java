package Model;

import Model.Parser.TAParser;

import java.util.ArrayList;

public class Location {

    private final String name;
    private TAParser.GuardContext invariant;
    private Interval invariantInterval;
    private ArrayList<Edge> edges;

    public Location(String name, TAParser.GuardContext invariant){
        this.name = name;
        this.invariant = invariant;
        this.edges = new ArrayList<>();
        this.invariantInterval = null;
    }

    public String getName() {
        return name;
    }

    public TAParser.GuardContext getInvariant() {
        return invariant;
    }

    public void setInvariant(TAParser.GuardContext invariant) {
        this.invariant = invariant;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void addEdge(TAParser.GuardContext guard, String action, ArrayList<String> resetClocks, Location target){
        this.edges.add(new Edge(guard, action, resetClocks, target));
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

    public void configInterval(){

    }
}
