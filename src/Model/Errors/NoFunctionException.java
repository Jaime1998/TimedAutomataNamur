package Model.Errors;

public class NoFunctionException extends RuntimeException{
    public NoFunctionException(){
        super("The symbol is not a function");
    }
}
