package Model.Errors;

public class AlreadyDefinedExpection extends RuntimeException{
    public AlreadyDefinedExpection(String symbol){
        super ("variable " + symbol + " is already defined");
    }
}
