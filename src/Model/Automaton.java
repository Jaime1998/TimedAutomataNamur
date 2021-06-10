package Model;

import Model.Types.Value;
import ilog.concert.*;
import ilog.cplex.*;

import java.util.*;

public class Automaton {

    private String name;
    private HashMap<String, Location> locations;
    private String initLocation;
    private Location currentLocation;
    private HashSet<String> actions;
    private HashMap<String, Clock> clocks;

    Automaton(String name){
        this.name = name;
        this.locations = new HashMap<>();
        this.initLocation = "";
        this.actions = new HashSet<>();
        this.clocks = new HashMap<>();
        this.currentLocation = null;
    }

    public void setCurrentLocation(Location currentLocation){
        this.currentLocation = currentLocation;
    }

    public Interval configInvariant(){
        double numMinInterval = this.minInvariant();
        double numMaxInterval = this.maxInvariant();
        return new Interval(numMinInterval, numMaxInterval);
    }

    public double maxInvariant(){
        try{
            IloCplex cplex = new IloCplex();

            //Variables

            IloNumVar d = cplex.numVar(0, Double.MAX_VALUE, "d");

            IloLinearNumExpr objective = cplex.linearNumExpr();
            objective.addTerm(1,d);

            GuardVisitor guardVisitor = new GuardVisitor(cplex, d, clocks);
            guardVisitor.visit(this.currentLocation.getInvariant());

            cplex.addMaximize(objective);

            if(cplex.solve()){

                return cplex.getValue(d);
            }
            else{
                return -1;
            }

        }catch (IloException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public double minInvariant(){
        try{
            IloCplex cplex = new IloCplex();

            //Variables

            IloNumVar d = cplex.numVar(0, Double.MAX_VALUE, "d");

            IloLinearNumExpr objective = cplex.linearNumExpr();
            objective.addTerm(1,d);

            GuardVisitor guardVisitor = new GuardVisitor(cplex, d, clocks);
            guardVisitor.visit(this.currentLocation.getInvariant());

            cplex.addMinimize(objective);

            if(cplex.solve()){

                return cplex.getValue(d);
            }
            else{
                return -1;
            }

        }catch (IloException e) {
            e.printStackTrace();
        }
        return -1;
    }


    public String getName(){
        return this.name;
    }

    public void addLocation(Location newLocation){
        this.locations.put(newLocation.getName(), newLocation);
    }

    public void addLocations(HashMap<String, Location> newLocations){
        this.locations.putAll(newLocations);
    }

    public Location getLocation(String nameLocation){
        return this.locations.get(nameLocation);
    }

    public void putClock(String nameClock){
        Clock newClock = new Clock(nameClock);
        this.clocks.put(newClock.getName(), newClock);
    }

    public void addClocks(HashMap<String, Clock> newClocks){
        this.clocks.putAll(newClocks);
    }

    public void setClockRate(String nameClock, double newRate){
        this.clocks.get(nameClock).setRate(newRate);
    }

    public void addAction(String nameAction){
        this.actions.add(nameAction);
    }

    public void addActions(Set<String> newActions){
        this.actions.addAll(newActions);
    }

    public void setInitLocation(String newInitLocation){
        this.initLocation = newInitLocation;
    }

    public void takeTransition(int i){
        for(String c: this.currentLocation.clocksToResetI(i)){
            clocks.get(c).resetValue();
        }
        this.currentLocation = this.currentLocation.getTargetI(i);
    }

}
