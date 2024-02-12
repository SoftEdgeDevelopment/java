package unit12.exceptions.learning47.customexception;

//creating a custom exception extending Exception
public class InsufficientBalanceException extends Exception{

    //generate constructor to display the message as String
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
