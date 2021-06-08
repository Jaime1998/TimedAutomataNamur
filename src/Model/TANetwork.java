package Model;

import java.util.*;

public class TANetwork {

    private Map<String, Automaton> network;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
    }

    public String getAutomatonName(String automaton){
        return this.network.get(automaton).getName();
    }

    public void addLocations(String automaton, HashMap<String, Location> locations){
        this.network.get(automaton).addLocations(locations);
    }

    public void addClocks(String automaton, HashMap<String, Clock> clocks){
        this.network.get(automaton).addClocks(clocks);
    }

    public void addActions(String automaton, Set<String> actions){
        this.network.get(automaton).addActions(actions);
    }

    public void setInitLocation(String automaton, String initLocation){
        this.network.get(automaton).setInitLocation(initLocation);
    }

}
