package Model.Errors;

public class CannotTakeTransition extends RuntimeException{
    public CannotTakeTransition(){
        super ("The transition cannot be taken");
    }
}

