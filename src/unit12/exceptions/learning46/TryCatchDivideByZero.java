package unit12.exceptions.learning46;

public class TryCatchDivideByZero {
    public static void main(String[] args) {
        //try catch example to catch divide by zero exception
        try{
            System.out.println(10/0);
        }
        //exception extending arithmeticException extending RunTimeException
        //same thing as writing catch (Exception e)
        catch (RuntimeException exception){

            //printStackTrace() to display where the exception occured
            exception.printStackTrace();

            //use getMessage() to display the exception message
            System.out.println("The exception message is " + exception.getMessage());

            System.out.println("Cannot divide by zero...");
        }
        System.out.println("After try, catch block...");
    }
}
