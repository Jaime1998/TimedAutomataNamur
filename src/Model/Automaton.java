package Model;

import ilog.concert.*;
import ilog.cplex.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public String getName(){
        return this.name;
    }

    public void addLocations(HashMap<String, Location> newLocations){
        this.locations.putAll(newLocations);
    }

    public void addClocks(HashMap<String, Clock> newClocks){
        this.clocks.putAll(newClocks);
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