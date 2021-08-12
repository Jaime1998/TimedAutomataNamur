package Model;

import Model.Errors.NoFindSymbolException;
import Model.Errors.NoLocationException;
import Model.Types.Clock;
import Model.Types.Number;
import Model.Types.Value;
import ilog.concert.*;
import ilog.cplex.*;

import java.lang.reflect.Array;
import java.util.*;

public class Automaton {

    private String name;
    private HashMap<String, Location> locations;
    private final int id;
    //private static int nextId = 0;

    Automaton(String name, int id){
        this.name = name;
        this.locations = new HashMap<>();
        this.id = id;
        //this.id = nextId++;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Location addLocation(Location newLocation, HashMap<String, Clock> clocks){
        newLocation.setRandomClocks(clocks);
        return this.locations.put(newLocation.getName(), newLocation);
    }

    public void addLocations(HashMap<String, Location> newLocations){
        this.locations.putAll(newLocations);
    }

    public Location getLocation(String nameLocation){
        return this.locations.get(nameLocation);
    }

    public void setClockRate(String location, String nameClock, double newRate){
        this.locations.get(location).setRate(nameClock, newRate);
    }

    public void takeDelayTransition(double d, State state){
        HashMap<String, Clock> clocks = state.getLocalClocks().get(this.id);

        for(Clock clock: clocks.values()){
            clock.increaseCurrentValue(d);
        }
        HashMap<String, Value> localMemory = state.getLocalMemory().get(this.id);
        HashMap<String, Value> globalMemory = state.getGlobalMemory();

        state.getCurrentLocations().get(this.id).configLocation(localMemory, globalMemory, clocks);
    }

    public void takeDiscreteTransition(int i, State state){
        Location loc = state.getCurrentLocations().get(this.id);
        HashMap<String, Clock> clocks = state.getLocalClocks().get(this.id);

        Location target = loc.takeDiscreteTransition(clocks, i);

        state.getCurrentLocations().set(this.id, target);

        HashMap<String, Value> localMemory = state.getLocalMemory().get(this.id);
        HashMap<String, Value> globalMemory = state.getGlobalMemory();

        target.configLocation(localMemory, globalMemory, clocks);
    }



}
