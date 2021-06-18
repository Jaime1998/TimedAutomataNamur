package Model;

import Model.Errors.AlreadyDefinedExpection;
import Model.Errors.NoFindSymbolException;
import Model.Types.Clock;
import Model.Types.Value;
import Model.Types.Number;

import java.util.*;

public class TANetwork {

    private LinkedHashMap<String, Automaton> network;
    private ArrayList<HashMap<String, Value>> memory;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
        this.memory = new ArrayList<>();
        this.memory.add(new HashMap<String, Value>());
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

    public boolean existsValue(String id){
        Value v;
        boolean exist;

        for(int i=this.memory.size() -1; i>=0; i--){
            exist = this.memory.get(i).containsKey(id);
            if(exist){
               return true;
            }
        }
        return false;
    }

    public void assignNewValue(String id, Value value){
        if(existsValue(id)){
            System.out.println(this.memory);
            System.out.println(id);
            System.out.println(((Number)value).getNumberValue());
            System.out.println(this.memory);
            throw new AlreadyDefinedExpection(id);
        }
        this.memory.get(this.memory.size()-1).put(id, value);
    }


    public Value updateValue(String id, Value value){
        Value v;
        for(int i=this.memory.size() -1; i>=0; i--){
            v = this.memory.get(i).get(id);
            if(v==null){
                continue;
            }
            if(v.isNumber() && value.isNumber()){
                this.memory.get(i).replace(id, value);
                return value;
            }
            if(v.isFunction() && value.isFunction()){
                this.memory.get(i).replace(id, value);
                return value;
            }
        }
        throw new NoFindSymbolException(id);
    }

    public boolean newEnv(){
        return this.memory.add(new HashMap<>());
    }

    public HashMap<String, Value> removeEnv(){
        return this.memory.remove(this.memory.size() - 1);
    }

    public void addValue(String id, Value newValue){
        int lastEnv = this.memory.size()-1;
        this.memory.get(lastEnv).put(id, newValue);
    }

    public Automaton addAutomaton(String nameNewAutomaton){
        this.memory.add(new HashMap<>());
        ArrayList<HashMap<String, Value>> currentMemory = new ArrayList<>(this.memory);
        Automaton newAutomaton = new Automaton(nameNewAutomaton, currentMemory);
        this.network.put(nameNewAutomaton, newAutomaton);
        return newAutomaton;
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


    public void addActions(String automaton, Set<String> actions){
        this.network.get(automaton).addActions(actions);
    }

    public void setInitLocation(String automaton, String initLocation){
        this.network.get(automaton).setInitLocation(initLocation);
    }
    /*
    public LinkedHashMap<Location, ArrayList<Edge>> getTransitions(){
        LinkedHashMap<Location, ArrayList<Edge>> transitions = new LinkedHashMap<>();
        for(Automaton automaton: this.network.values()){
            ArrayList<Edge> edge = new ArrayList<>();
            transitions.put()
        }
        return transitions;
    }
    
     */

}
