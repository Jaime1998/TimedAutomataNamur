package Controller;

import Model.Automaton;
import Model.Errors.AlreadyDefinedExpection;
import Model.Location;
import Model.State;
import Model.TANetwork;
import Model.Types.Value;

import java.util.ArrayList;

public class Controller {
    private TANetwork automata;
    private ArrayList<State> statesRecord;
    private int currentTrace ;

    public Controller (){
        this.automata = new TANetwork();
        this.statesRecord = new ArrayList<>();
        this.statesRecord.add(new State());
        this.currentTrace = 0;
    }

    public Automaton addAutomaton(String name){
        return this.automata.addAutomaton(name);
    }

    public TANetwork getAutomata(){
        return this.automata;
    }

    public void assignNewValue(Automaton automaton, String id, Value value){
        this.statesRecord.get(this.currentTrace).assignNewValue(automaton, id, value);
    }

    public Value getValue(Automaton automaton, String id){
        return this.statesRecord.get(this.currentTrace).getValue(automaton, id);
    }

    public Value updateValue(Automaton automaton, String id, Value value){
        return this.statesRecord.get(this.currentTrace).updateValue(automaton, id, value);
    }


    public void takeDiscreteTransition(int i){
        State currentState = this.statesRecord.get(this.statesRecord.size()-1);
        this.automata.takeDiscreteTransition(i, currentState);
    }


}
