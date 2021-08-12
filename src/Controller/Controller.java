package Controller;

import Model.*;
import Model.Errors.AlreadyDefinedExpection;
import Model.Errors.NoLocationException;
import Model.Types.Clock;
import Model.Types.Value;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    private TANetwork automata;
    private ArrayList<State> statesRecord;
    private int currentTrace;

    public Controller() {
        this.automata = new TANetwork();
        this.statesRecord = new ArrayList<>();
        this.statesRecord.add(new State());
        this.currentTrace = 0;
    }

    public Automaton addAutomaton(String name) {
        this.statesRecord.get(this.currentTrace).addAutomatonState();
        return this.automata.addAutomaton(name);
    }

    public Location addLocation(String nameAutomaton, Location loc) {
        State currentState = this.statesRecord.get(this.currentTrace);
        return this.automata.addLocation(nameAutomaton, loc, currentState);
    }

    public TANetwork getAutomata() {
        return this.automata;
    }

    public void assignNewValue(Automaton automaton, String id, Value value) {
        this.statesRecord.get(this.currentTrace).assignNewValue(automaton, id, value);
    }

    public Value getValue(Automaton automaton, String id) {
        return this.statesRecord.get(this.currentTrace).getValue(automaton, id);
    }

    public Value updateValue(Automaton automaton, String id, Value value) {
        return this.statesRecord.get(this.currentTrace).updateValue(automaton, id, value);
    }

    public void setInitLocation(String nameAutomaton, String nameLocation) {
        Location loc = this.automata.getLocation(nameAutomaton, nameLocation);
        if (loc == null) {
            throw new NoLocationException(nameLocation);
        }
        State currentState = this.statesRecord.get(this.currentTrace);
        int idAutomaton = this.automata.getIdAutomaton(nameAutomaton);
        currentState.addInitLocation(idAutomaton, loc);
    }

    public void putClock(int idAutomaton, String nameClock) {
        System.out.println(this.statesRecord.size());
        System.out.println(this.currentTrace);
        this.statesRecord.get(this.currentTrace).putClock(idAutomaton, nameClock);
    }

    public void takeDelayTransition(double d) {

        State currentState = this.statesRecord.get(this.currentTrace);

        System.out.println("estado actual");
        System.out.println(currentState);

        State duplicatedState = new State(currentState);

        boolean could = this.couldDelayTransition(d, duplicatedState);
        if (could) {
            this.automata.takeDelayTransition(d, duplicatedState);
        }
        this.statesRecord.add(duplicatedState);
        this.currentTrace++;
        System.out.println("estado actual");
        System.out.println(currentState);
        System.out.println("estado duplicado");
        System.out.println(duplicatedState);
    }

    public boolean couldDelayTransition(double d, State state) {
        for (Location loc : state.getCurrentLocations()) {
            if (!loc.couldDelayTransition(d)) {
                return false;
            }
        }
        return true;
    }

    public void takeDiscreteTransition(int i) {
        State currentState = this.statesRecord.get(this.currentTrace);
        State duplicatedState = new State(currentState);

        this.automata.takeDiscreteTransition(i, duplicatedState);
        this.statesRecord.add(duplicatedState);

        this.currentTrace++;
    }

    public String getVariablesString() {
        String output = "";
        int numAutomaton = 0;
        for (HashMap<String, Clock> clocks : this.statesRecord.get(this.currentTrace).getLocalClocks()) {
            output = output.concat("Automaton ".concat(Integer.toString(numAutomaton)));
            numAutomaton++;

            for (Clock clock : clocks.values()) {
                output = output.concat("\t");
                output = output.concat(clock.getName()).concat(" = ");
                output = output.concat(Double.toString(clock.getCurrentValue()));
                output = output.concat("(rate = ").concat(Double.toString(clock.getRate())).concat(")");
                output = output.concat("\n");
            }
        }
        return output;
    }

    public ArrayList<Location> getCurrentLocation (){
        State currentState = this.statesRecord.get(this.currentTrace);
        return currentState.getCurrentLocations();
    }

    public Interval intersectionInvariants() {
        return new Interval(lowerBoundInvariant(), upperBoundInvariant());
    }

    /**
     * Among invariants of current location, return the max lower bound
     * @return
     */
    public double lowerBoundInvariant(){
        State currentState = this.statesRecord.get(this.currentTrace);
        double lowerBound = 0.0;
        for(Location loc: currentState.getCurrentLocations()){
            double lowerLocInv = loc.getInvariantInterval().getMin();
            if(lowerLocInv > lowerBound){
                lowerBound = lowerLocInv;
            }
        }
        return lowerBound;
    }

    /**
     * Among invariants of current location, return the min upper bound
     * @return
     */
    public double upperBoundInvariant(){
        State currentState = this.statesRecord.get(this.currentTrace);
        double upperBound = Double.POSITIVE_INFINITY;
        for(Location loc: currentState.getCurrentLocations()){
            double upperLocInv = loc.getInvariantInterval().getMax();
            if(upperLocInv < upperBound){
                upperBound = upperLocInv;
            }
        }
        return upperBound;
    }


    public ArrayList<ArrayList<String>> getTraceLocation(){
        ArrayList<ArrayList<String>> trace = new ArrayList<>();
        for(State state: this.statesRecord){
            trace.add(state.getNameLocations());
        }
        return trace;
    }


}
