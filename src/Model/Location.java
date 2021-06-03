package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public class Location {

    private final String name;
    private final HashMap<String, Clock> clocks;
    private Function<Void, Interval> invariant;
    private HashMap<String, ArrayList<TransToLocation>> edge;

    public Location(String name, HashMap<String, Clock> clocks){
        this.name = name;
        this.clocks = clocks;
        this.invariant = (Void)-> null;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Clock> getClocks() {
        return clocks;
    }

    public Function<Void, Interval> getInvariant() {
        return invariant;
    }

    public void setInvariant(Function<Void, Interval> invariant) {
        this.invariant = invariant;
    }

    public HashMap<String, ArrayList<TransToLocation>> getEdge() {
        return edge;
    }

    public void setEdge(HashMap<String, ArrayList<TransToLocation>> edge) {
        this.edge = edge;
    }

    private static class TransToLocation {
        private Function<Void, Interval> guard;
        private ArrayList<String> resetClocks;
        private Location target;

        public TransToLocation(Function<Void, Interval> guard, Location target, ArrayList<String> resetClocks){
            this.guard = guard;
            this.resetClocks = resetClocks;
            this.target = target;
        }

        public Function<Void, Interval> getGuard() {
            return guard;
        }

        public void setGuard(Function<Void, Interval> guard) {
            this.guard = guard;
        }

        public ArrayList<String> getResetClocks() {
            return resetClocks;
        }

        public void setResetClocks(ArrayList<String> resetClocks) {
            this.resetClocks = resetClocks;
        }

        public Location getTarget() {
            return target;
        }

        public void setTarget(Location target) {
            this.target = target;
        }
    }

}
