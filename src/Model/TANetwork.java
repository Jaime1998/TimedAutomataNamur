package Model;

import Model.Types.Value;

import java.util.*;

public class TANetwork {

    private LinkedHashMap<String, Automaton> network;
    private ArrayList<HashMap<String, Value>> memory;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
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
        return null;
    }

    public void addValue(String id, Value newValue){
        int lastEnv = this.memory.size()-1;
        this.memory.get(lastEnv).put(id, newValue);
    }

    public void addAutomaton(String nameNewAutomaton){
        Automaton newAutomaton = new Automaton(nameNewAutomaton);
        this.network.put(nameNewAutomaton, newAutomaton);
    }

    public void addAutomaton(Automaton newAutomaton){
        this.network.put(newAutomaton.getName(), newAutomaton);
    }

    public Automaton getAutomaton(String automaton){
        return this.network.get(automaton);
    }

    public LinkedHashMap<String, Automaton> getAutomaton(){
        return this.network;
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
