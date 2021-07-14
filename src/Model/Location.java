package Model;

import Model.Errors.CannotTakeTransition;
import Model.Parser.TAParser;
import Model.Types.Clock;
import Model.Types.Number;
import Model.Types.Value;
import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

import java.util.*;

public class Location {

    private final String name;
    private TAParser.GuardContext invariant;
    private Interval invariantInterval;
    private ArrayList<Edge> edges;
    private HashMap<String, Double> clockRates;
    private static Random rand = new Random();

    public Location(String name, TAParser.GuardContext invariant){
        this.name = name;
        this.invariant = invariant;
        this.invariantInterval = null;
        this.edges = new ArrayList<>();
        this.clockRates = new HashMap<>();
    }

    public void setRate(String clock, double newRate){
        this.clockRates.put(clock, newRate);
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

    public Interval getInvariantInterval() {
        return invariantInterval;
    }

    public void setInvariantInterval(Interval invariantInterval) {
        this.invariantInterval = invariantInterval;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void addEdge(TAParser.GuardContext guard, String action, HashSet<String> resetClocks, Location target){
        this.edges.add(new Edge(guard, action, resetClocks, target));
    }

    public TAParser.GuardContext guardI(int i){
        return this.edges.get(i).getGuard();
    }
    public String actionI(int i){
        return this.edges.get(i).getAction();
    }
    public HashSet<String> clocksToResetI(int i){
        return this.edges.get(i).getResetClocks();
    }
    public Location getTargetI(int i){
        return this.edges.get(i).getTarget();
    }

    public void setRandomClocks(HashMap<String, Clock> clocks){

        for(Clock clock: clocks.values()){
            int randomRate = rand.nextInt(1000);
            this.clockRates.put(clock.getName(), (double) randomRate);
        }
    }

    public Location takeDiscreteTransition(HashMap<String, Clock> clocks, int i){
        Edge edge = this.edges.get(i);

        if(edge.getGuardInterval().getMin()>0){
            throw new CannotTakeTransition();
        }

        HashSet<String> resetClocks = edge.getResetClocks();
        for(String nameResetClock: resetClocks){
            clocks.get(nameResetClock).resetValue();
        }
        return edge.getTarget();
    }

    public void configLocation(ArrayList<HashMap<String, Value>> memory, HashMap<String, Clock> clocks){
        for(Clock clock: clocks.values()){
            clock.setRate(1);
        }
        for(Map.Entry<String, Double> rate: this.clockRates.entrySet()){
            clocks.get(rate.getKey()).setRate(rate.getValue());
        }

        this.configInvariant(memory, clocks);
        for(int i=0; i<this.edges.size(); i++){
            this.configEdge(memory, clocks, i);
        }
    }


    public Interval configInvariant(ArrayList<HashMap<String, Value>> memory, HashMap<String, Clock> clocks){
        if(getInvariant() == null){
            Interval interval = new Interval(0, Double.POSITIVE_INFINITY);
            this.setInvariantInterval(interval);
            return interval;
        }
        TAParser.GuardContext invariant = getInvariant();
        double numMinInterval = this.minGuard(invariant, memory, clocks, new HashSet<>());
        double numMaxInterval = this.maxGuard(invariant, memory, clocks, new HashSet<>());
        Interval intervalInvariant = new Interval(numMinInterval, numMaxInterval);

        setInvariantInterval(intervalInvariant);
        return intervalInvariant;
    }

    public void configEdge(ArrayList<HashMap<String, Value>> memory, HashMap<String, Clock> clocks, int i){
        if(this.edges.get(i) ==null){
            Interval interval = new Interval(0, Double.POSITIVE_INFINITY);
            this.edges.get(i).setGuardInterval(interval);
            return;
        }

        Interval intervalGuard = configGuardEdge(memory, clocks, i);
        Interval intervalInvariantTarget = configInvariantTarget(memory, clocks, i);

        this.edges.get(i).setGuardInterval(intersection(this.invariantInterval, intervalGuard, intervalInvariantTarget));
    }

    public Interval configGuardEdge(ArrayList<HashMap<String, Value>> memory,
                                    HashMap<String, Clock> clocks,
                                    int i){
        TAParser.GuardContext guard = this.edges.get(i).getGuard();
        if(guard == null){
            return new Interval(0, Double.POSITIVE_INFINITY);
        }
        double numMinGuard = this.minGuard(guard, memory, clocks, new HashSet<>());
        double numMaxGuard = this.maxGuard(guard, memory, clocks, new HashSet<>());
        return new Interval(numMinGuard, numMaxGuard);
    }

    public Interval configInvariantTarget(ArrayList<HashMap<String, Value>> memory,
                                          HashMap<String, Clock> clocks,
                                          int i){
        HashSet<String> resetClocks = this.edges.get(i).getResetClocks();


        TAParser.GuardContext invariantTarget = this.edges.get(i).getTarget().getInvariant();
        if(invariantTarget == null){
            return new Interval(0, Double.POSITIVE_INFINITY);
        }

        double numMinInvTarget = this.minGuard(invariantTarget, memory, clocks, resetClocks);
        double numMaxInvTarget = this.maxGuard(invariantTarget, memory, clocks, resetClocks);
        return new Interval(numMinInvTarget, numMaxInvTarget);
    }

    public double minGuard(TAParser.GuardContext guard,
                           ArrayList<HashMap<String, Value>> memory,
                           HashMap<String, Clock> clocks,
                           HashSet<String> resetClocks){
        try{
            IloCplex cplex = new IloCplex();

            //Variables

            IloNumVar d = cplex.numVar(0, Double.POSITIVE_INFINITY, "d");

            IloLinearNumExpr objective = cplex.linearNumExpr();
            objective.addTerm(1,d);

            GuardVisitor guardVisitor = new GuardVisitor(cplex, d, memory, clocks, resetClocks);

            Object visitedGuard = guardVisitor.visit(guard);

            if(visitedGuard instanceof Number){
                if(!((Number) visitedGuard).toBoolean()){
                    return Double.POSITIVE_INFINITY;
                }
            }

            cplex.addMinimize(objective);

            if(cplex.solve()){
                return cplex.getValue(d);
            }
            else{
                return Double.POSITIVE_INFINITY;
            }

        }catch (IloException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public double maxGuard(TAParser.GuardContext guard,
                           ArrayList<HashMap<String, Value>> memory,
                           HashMap<String, Clock> clocks,
                           HashSet<String> resetClocks){
        try{
            IloCplex cplex = new IloCplex();

            //Variables

            IloNumVar d = cplex.numVar(0, Double.POSITIVE_INFINITY, "d");

            IloLinearNumExpr objective = cplex.linearNumExpr();
            objective.addTerm(1,d);

            GuardVisitor guardVisitor = new GuardVisitor(cplex, d, memory, clocks, resetClocks);

            Object visitedGuard = guardVisitor.visit(guard);

            if(visitedGuard instanceof Number){
                if(!((Number) visitedGuard).toBoolean()){
                    return Double.POSITIVE_INFINITY;
                }
            }

            cplex.addMaximize(objective);

            if(cplex.solve()){

                return cplex.getValue(d);
            }
            else{
                return Double.POSITIVE_INFINITY;
            }

        }catch (IloException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Interval intersection(Interval interval1, Interval interval2){
        return new Interval(Math.max(interval1.getMin(), interval2.getMin()),
                            Math.min(interval1.getMax(), interval2.getMax()));
    }

    public Interval intersection(Interval interval1, Interval interval2, Interval interval3){
        return new Interval(
                Math.max(Math.max(interval1.getMin(), interval2.getMin()), interval3.getMin()),
                Math.min(Math.min(interval1.getMax(), interval2.getMax()), interval3.getMax())
        );
    }
}
