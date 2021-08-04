package Model;

import Model.Errors.AlreadyDefinedExpection;
import Model.Errors.NoFindSymbolException;
import Model.Types.Clock;
import Model.Types.Value;
import Model.Types.Number;

import java.util.*;

public class TANetwork {

    private LinkedHashMap<String, Automaton> network;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
    }

    public int size(){
        return this.network.size();
    }

    public Automaton addAutomaton(String nameNewAutomaton){
        Automaton newAutomaton = new Automaton(nameNewAutomaton);
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

    public void setInitLocation(String automaton, String initLocation){
        this.network.get(automaton).setInitLocation(initLocation);
    }

    public String getVariablesString(){
        String output = "";
        for(Automaton automaton: this.network.values()){
            output = output.concat("Automaton ").concat(automaton.getName()).concat("\n");
            output = output.concat(automaton.getVariablesString());
        }
        return output;
    }

    /**
     * With i transition, identify the automaton which takes the transition
     * @param i
     * @return
     */
    public void takeDiscreteTransition(int i, State state){
        int numTargets;
        int numAutomaton = 0;
        for(Automaton automaton: this.network.values()){
            Location loc = state.getCurrentLocations().get(numAutomaton);
            numTargets = loc.getNumTargets();
            i=i-numTargets;
            if(i<=numTargets){
                automaton.takeDiscreteTransition(i, state);
                return;
            }

            numAutomaton++;
        }
        throw new RuntimeException();
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
