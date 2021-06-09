package Model;

import Model.Types.Value;

import java.util.*;

public class TANetwork {

    private LinkedHashMap<String, Automaton> network;
    private HashMap<String, Value> global;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
    }

    public Value getValue(String id){
        return global.get(id);
    }

    public void addValue(String id, Value newValue){
        global.put(id, newValue);
    }

    public void addAutomaton(String nameNewAutomaton){
        Automaton newAutomaton = new Automaton(nameNewAutomaton);
        this.network.put(nameNewAutomaton, newAutomaton);
    }

    public void addAutomaton(Automaton newAutomaton){
        this.network.put(newAutomaton.getName(), newAutomaton);
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
