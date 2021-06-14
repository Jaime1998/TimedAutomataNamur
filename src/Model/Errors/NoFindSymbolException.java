package Model.Errors;

public class NoFindSymbolException extends RuntimeException{
    public NoFindSymbolException(String symbol){
        super ("cannot find symbol" + symbol);
    }
}
