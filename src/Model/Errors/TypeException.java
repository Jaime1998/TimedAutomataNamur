package Model.Errors;

public class TypeException extends RuntimeException {
    public TypeException(String errorMessage){
        super(errorMessage);
    }
}
