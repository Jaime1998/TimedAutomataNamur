package Controller;

import Model.State;
import Model.TANetwork;

import java.util.ArrayList;

public class Controller {
    private TANetwork automata;
    private ArrayList<State> statesRecord;

    public Controller (){
        this.automata = new TANetwork();
        this.statesRecord = new ArrayList<>();
    }
}
