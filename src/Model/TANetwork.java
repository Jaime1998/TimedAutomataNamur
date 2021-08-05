package Model;

import Model.Errors.AlreadyDefinedExpection;
import Model.Errors.NoFindSymbolException;
import Model.Types.Clock;
import Model.Types.Value;
import Model.Types.Number;

import java.util.*;

public class TANetwork {

    private LinkedHashMap<String, Automaton> network;

    //Used to give id to each automaton. Every id correspond to the index in array of states
    protected int idAssign;

    public TANetwork(){
        this.network = new LinkedHashMap<>();
        this.idAssign=0;
    }

    public int size(){
        return this.network.size();
    }

    public Automaton addAutomaton(String nameNewAutomaton){
        Automaton newAutomaton = new Automaton(nameNewAutomaton, idAssign++);
        this.network.put(nameNewAutomaton, newAutomaton);
        return newAutomaton;
    }

    public Automaton getAutomaton(String automaton){
        return this.network.get(automaton);
    }

    public LinkedHashMap<String, Automaton> getAutomaton(){
        return this.network;
    }

    public Location addLocation(String nameAutomaton, Location loc, State currentState){
        Automaton automaton = this.network.get(nameAutomaton);
        System.out.println("empieza");
        System.out.println(nameAutomaton);
        System.out.println(this.network.get(nameAutomaton).getId());
        System.out.println("estado en adicionar loca");
        System.out.println(currentState.toString());
        System.out.println("estado en finalizar loca");
        HashMap<String, Clock> clocks = currentState.getLocalClocks().get(automaton.getId());
        System.out.println("terminaaa");
        return automaton.addLocation(loc, clocks);
    }

    public void addLocations(String automaton, HashMap<String, Location> locations){
        this.network.get(automaton).addLocations(locations);
    }

    public Location getLocation(String nameAutomaton, String nameLocation){
        return this.network.get(nameAutomaton).getLocation(nameLocation);
    }

    public int getIdAutomaton(String nameAutomaton){
        return this.network.get(nameAutomaton).getId();
    }

    public void takeDelayTransition(double d, State state){
        for(Automaton automaton: this.network.values()){
            automaton.takeDelayTransition(d, state);
        }
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

            System.out.println("calculo del indice del edge ");
            System.out.println("aquí i es: "+i);
            System.out.println("numTargets es"+ numTargets);
            if(i<numTargets){
                automaton.takeDiscreteTransition(i, state);
                return;
            }
            i=i-numTargets;

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
