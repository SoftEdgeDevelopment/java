package unit12.exceptions.learning46;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //try catch example with multiple catch blocks will not display more than one catch because the program stops
        try{
            //arithmetic one
            System.out.println(10/0);
            //ArrayOutOfBoundIndex
            int[] numbers = new int[3];
            System.out.println(numbers[100]);

            //ArithmeticException
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero...");
        }

        //will not display this because the try block causes the rest of the code to stop running
        //ArraryIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are out of bounds of the array");
        }
    }
}
