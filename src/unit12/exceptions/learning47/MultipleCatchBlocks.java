package unit12.exceptions.learning47;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        //multiple catch blocks example, ArrayIndexOutOfBoundsException, NullPointerException
        try{
            //ArrayIndexOutOfBoundsException
            int[] numbers = new int[3];
            numbers[5] = 7;
            //NullPointerException
            String userString = null;
            userString.length();

            //to catch for 2 different exceptions
        }catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Array index out of bounds exception occurred...");

            //when NullPointerException occurs
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Null pointer exception occurred...");
        }catch (Exception e){
            System.out.println("Exception occurred...");
        }
        System.out.println("*".repeat(15));
        System.out.println("After try... catch block");
        System.out.println("*".repeat(15));
    }
}
