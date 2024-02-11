package unit12.exceptions.learning47;

public class FinallyBlock {
    public static void main(String[] args) {
        //try catch example with finally throwing an ArithmeticException
        try {
            System.out.println("Before the exception.");
            System.out.println(10 / 0);
            String word = null;
            word.length();
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception has occurred...");
            //will not be displayed if ArithmeticException is caught first
        } catch (NullPointerException e) {
            System.out.println("A null pointer exception has occurred...");
            //finally is always executed
        } finally {
            System.out.println("The code from the finally block");
        }
        System.out.println("End of try/catch/finally");
    }
}
