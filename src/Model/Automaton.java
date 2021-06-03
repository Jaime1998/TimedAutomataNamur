package Model;

import ilog.concert.*;
import ilog.cplex.*;

import java.util.HashMap;
import java.util.HashSet;

public class Automaton {

    private String name;
    private HashMap<String, Location> locations;
    private Location initLocation;
    private HashSet<String> actions;
    private HashMap<String, Clock> clocks;

    Automaton(String name){
        this.name = name;
    }

}
