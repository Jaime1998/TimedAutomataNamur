package Model;

import Model.Types.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class State {
    private ArrayList<String> currentLocations ;
    private ArrayList<HashMap<String, Value>> memory;
    private HashMap<String, Value> globalMemory;

    public State(){

    }
}
