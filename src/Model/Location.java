package Model;

import java.util.HashSet;
import java.util.function.Consumer;

public class Location {

    private final String name;
    private final HashSet<Clock> clocks;
    private Consumer invariant;

    public Location(String name, HashSet<Clock> clocks){
        this.name = name;
        this.clocks = clocks;
        this.invariant = null;
    }

    public String getName() {
        return this.name;
    }

    public HashSet<Clock> getClocks() {
        return this.clocks;
    }
}
