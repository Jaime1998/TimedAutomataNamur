package Model;

import ilog.concert.*;
import ilog.cplex.*;

import java.util.HashSet;

public class Automaton {

    private String name;
    private HashSet<Location> locations;
    private Location initLocation;
    private HashSet<String> actions;
    private HashSet<Clock> clocks;

    Automaton(String name){
        this.name = name;
    }

}
