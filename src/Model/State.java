package Model;

import Model.Errors.AlreadyDefinedExpection;
import Model.Errors.NoFindSymbolException;
import Model.Types.Clock;
import Model.Types.Number;
import Model.Types.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class State {

    private HashMap<String, Value> globalMemory;
    private ArrayList<HashMap<String, Value>> localMemory;
    private ArrayList<HashMap<String, Clock>> localClocks;
    private ArrayList<Location> currentLocations ;

    public State(){
        this.globalMemory = new HashMap<>();
        this.localMemory = new ArrayList<>();
        this.localClocks = new ArrayList<>();
        this.currentLocations = new ArrayList<>();
    }

    public State(State stateIn){
        this.globalMemory = new HashMap<>(stateIn.globalMemory);
        this.localMemory = new ArrayList<>();
        for (HashMap<String, Value> values: stateIn.localMemory){
            this.localMemory.add(new HashMap<>(values));
        }
        this.localClocks = new ArrayList<>();
        for (HashMap<String, Clock> clocks: stateIn.localClocks){
            this.localClocks.add(new HashMap<>(clocks));
        }
        this.currentLocations = new ArrayList<>();
        this.currentLocations.addAll(stateIn.currentLocations);
    }

    public State(HashMap<String, Value> globalMemory,
                 ArrayList<HashMap<String, Value>> localMemory,
                 ArrayList<HashMap<String, Clock>> localClocks,
                 ArrayList<Location> currentLocations){

        this.globalMemory = new HashMap<>(globalMemory);

        this.localMemory = new ArrayList<>();
        for(HashMap<String, Value> values: localMemory) {
            this.localMemory.add(new HashMap<>(values));
        }

        this.localClocks = new ArrayList<>();
        for(HashMap<String, Clock> clocks: localClocks) {
            this.localClocks.add(new HashMap<>(clocks));
        }

        this.currentLocations = new ArrayList<>();
        this.currentLocations.addAll(currentLocations);
    }

    public HashMap<String, Value> getGlobalMemory() {
        return globalMemory;
    }

    public void setGlobalMemory(HashMap<String, Value> globalMemory) {
        this.globalMemory = globalMemory;
    }

    public ArrayList<HashMap<String, Value>> getLocalMemory() {
        return localMemory;
    }

    public void setLocalMemory(ArrayList<HashMap<String, Value>> localMemory) {
        this.localMemory = localMemory;
    }

    public ArrayList<HashMap<String, Clock>> getLocalClocks() {
        return this.localClocks;
    }

    public void setLocalClocks(ArrayList<HashMap<String, Clock>> localClocks) {
        this.localClocks = localClocks;
    }

    public ArrayList<Location> getCurrentLocations() {
        return this.currentLocations;
    }

    public void setCurrentLocations(ArrayList<Location> currentLocations) {
        this.currentLocations = currentLocations;
    }

    public void addAutomatonState(){
        this.localMemory.add(new HashMap<>());
        this.localClocks.add(new HashMap<>());
    }

    public void addInitLocation(int idAutomaton, Location initLoc){
        this.currentLocations.add(initLoc);
        initLoc.configLocation(this.localMemory.get(idAutomaton),
                                this.globalMemory,
                                this.getLocalClocks().get(idAutomaton));

    }

    public void putClock(int idAutomaton, String nameClock){
        Clock newClock = new Clock(nameClock);
        System.out.println("relojes");
        System.out.println(this.localClocks.size());
        this.localClocks.get(idAutomaton).put(nameClock, newClock);
    }

    public boolean existsValue(Automaton automaton, String id){
        Value v;
        v = this.localMemory.get(automaton.getId()).get(id);
        if(v!=null){
            return true;
        }
        v = this.globalMemory.get(id);
        return v != null;
    }

    public Value getValue(Automaton automaton, String id){
        Value v;
        v = this.localMemory.get(automaton.getId()).get(id);
        if(v!=null){
            return v;
        }
        v = this.globalMemory.get(id);
        if(v!=null){
            return v;
        }
        throw new NoFindSymbolException(id);
    }

    public void assignNewValue(Automaton automaton, String id, Value value){
        if(existsValue(automaton, id)){
            throw new AlreadyDefinedExpection(id);
        }
        if(automaton==null){
            this.globalMemory.put(id, value);
            return;
        }
        this.localMemory.get(automaton.getId()).put(id, value);
    }


    public Value updateValue(Automaton automaton, String id, Value value){
        Value v;
        if(automaton==null){
            v = this.globalMemory.get(id);
            if(v==null){
                throw new NoFindSymbolException(id);
            }
            if(v.isNumber() && value.isNumber()){
                this.globalMemory.replace(id, value);
                return value;
            }
            if(v.isFunction() && value.isFunction()){
                this.globalMemory.replace(id, value);
                return value;
            }
        }
        else{
            v=this.localMemory.get(automaton.getId()).get(id);
            if(v==null){
                throw new NoFindSymbolException(id);
            }
            if(v.isNumber() && value.isNumber()){
                this.localMemory.get(automaton.getId()).replace(id, value);
                return value;
            }
            if(v.isFunction() && value.isFunction()){
                this.localMemory.get(automaton.getId()).replace(id, value);
                return value;
            }
        }

        throw new NoFindSymbolException(id);
    }

    @Override
    public String toString(){
        String output = "Global memory:\n";
        for(Map.Entry<String, Value> v: this.globalMemory.entrySet()){
            output = output.concat(v.getKey());
            if(v instanceof Number){
                output = output.concat(": ").concat(Double.toString(((Number) v).getNumberValue()));
            }
            output = output.concat("\n");
        }
        output = output.concat("\nLocal memory:\n");
        int i=0;
        for (HashMap<String, Value> values: this.localMemory){
            output = output.concat(Integer.toString(i++)).concat("\n");
            for(Map.Entry<String, Value> v: values.entrySet()){
                output = output.concat("\t").concat(v.getKey());
                if(v.getValue() instanceof Number){
                    output = output.concat(": ").concat(Double.toString(((Number) v).getNumberValue()));
                }
                output = output.concat("\n");
            }
        }

        output = output.concat("\nClocks:\n");
        i=0;
        for (HashMap<String, Clock> clocks: this.localClocks){
            output = output.concat(Integer.toString(i++)).concat("\n");
            for(Map.Entry<String, Clock> c: clocks.entrySet()){
                output = output.concat("\t").concat(c.getKey());
                output = output.concat(": ").concat(Double.toString(c.getValue().getCurrentValue()));
                output = output.concat("\n");
            }
        }
        return output;
    }

}
