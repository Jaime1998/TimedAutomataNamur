package Model.Errors;

public class NoLocationException extends RuntimeException{
    public NoLocationException(String symbol){
        super ("cannot find symbol " + symbol + " as a location");
    }
}
