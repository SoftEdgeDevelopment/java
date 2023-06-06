package unit06.array.day25.foreach;

//foreach loop to print the odd numbers
public class OddNumberPrint {
    public static void main(String[] args) {
        //new array of numbers 1-10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //for each element - (number) in the array - (numbers), if element remainder after being divided by 2 does not equal 0, then it is odd
        for (int number : numbers) {
            if (number % 2 != 0) {
                //prints out all odd elements - (number) in the array - (numbers)
                System.out.println(number);
            }
        }
    }
}
