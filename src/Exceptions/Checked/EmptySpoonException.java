package Exceptions.Checked;

public class EmptySpoonException extends Exception{
    public EmptySpoonException(){
        super("Trying to eat from empty spoon");
    }
}
