package unit12.exceptions.learning46;

public class TryCatchDivideByZero {
    public static void main(String[] args) {
        //try catch example to catch divide by zero exception
        try{
            System.out.println(10/0);
        } catch (Exception exception){
            System.out.println("Cannot divide by zero...");
        }
        System.out.println("After try, catch block...");
    }
}
