package unit04.iteration.learning17;
//for loop to find the sum of the odd numbers 1-9
public class SumOfOddNumbers {
    public static void main(String[] args) {
//        Write a for loop to add odd numbers
//        between 1 and 10
//        print the result at the end.
//        1+3+5+7+9
        //new int total starts from 0
        int total = 0;
        //from 1 until 9, add 2
        for (int i = 1; i <= 9; i = i + 2) {
            //total will equal total + i (0+1)(1+3)(4+5)(9+7)(16+9) = 25
            total = total + i;
        }
        //display total (25)
        System.out.println("Total is " + total);
    }
}
