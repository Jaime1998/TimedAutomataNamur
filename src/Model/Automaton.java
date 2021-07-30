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
    private String initLocation;
    private Location currentLocation;
    private HashSet<String> actions;
    private HashMap<String, Clock> clocks;
    private ArrayList<HashMap<String, Value>> memory;

    Automaton(String name, ArrayList<HashMap<String, Value>> memory){
        this.name = name;
        this.locations = new HashMap<>();
        this.initLocation = "";
        this.actions = new HashSet<>();
        this.currentLocation = null;
        this.clocks = new HashMap<>();
        this.memory = memory;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public ArrayList<HashMap<String, Value>> getMemory(){
        return this.memory;
    }

    public Value getValue(String id){
        Value v;

        for(int i=this.memory.size() -1; i>=0; i--){
            v=this.memory.get(i).get(id);
            if(v!=null){
                return v;
            }
        }
        throw new NoFindSymbolException(id);
    }

    public void setCurrentLocation(Location currentLocation){
        this.currentLocation = currentLocation;
        this.currentLocation.configLocation(this.memory, this.clocks);
    }

    public ArrayList<Edge> getEdges(){
        return this.currentLocation.getEdges();
    }


    public String getName(){
        return this.name;
    }

    public void addLocation(Location newLocation){
        this.locations.put(newLocation.getName(), newLocation);
        newLocation.setRandomClocks(this.clocks);
    }

    public void addLocations(HashMap<String, Location> newLocations){
        this.locations.putAll(newLocations);
    }

    public Location getLocation(String nameLocation){
        return this.locations.get(nameLocation);
    }

    public void putClock(String nameClock){
        Clock newClock = new Clock(nameClock);
        this.clocks.put(nameClock, newClock);
    }

    public void setClockRate(String location, String nameClock, double newRate){
        this.locations.get(location).setRate(nameClock, newRate);
    }

    public void addAction(String nameAction){
        this.actions.add(nameAction);
    }

    public void addActions(Set<String> newActions){
        this.actions.addAll(newActions);
    }

    public void setInitLocation(String newInitLocation){
        if(!this.locations.containsKey(newInitLocation)){
            throw new NoLocationException(newInitLocation);
        }
        this.initLocation = newInitLocation;
    }

    public void takeDelayTransition(double d){
        for(Clock clock: this.clocks.values()){
            clock.increaseCurrentValue(d);
        }
        this.currentLocation.configLocation(memory, clocks);
        //this.currentLocation.takeDelayTransition(d);
    }

    public void takeDiscreteTransition(int i){
        Location target = this.currentLocation.takeDiscreteTransition(this.clocks, i);

        this.setCurrentLocation(target);
    }

    public String getVariablesString(){
        String output = "";
        for(Clock clock: this.clocks.values()){
            output = output.concat("\t");
            output = output.concat(clock.getName()).concat(" = ");
            output = output.concat(Double.toString(clock.getCurrentValue()));
            output = output.concat("(rate = ").concat(Double.toString(clock.getRate())).concat(")");
            output = output.concat("\n");
        }
        return output;
    }

}
