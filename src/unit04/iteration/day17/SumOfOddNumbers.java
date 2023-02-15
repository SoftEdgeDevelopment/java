package unit04.iteration.day17;

public class SumOfOddNumbers {
    public static void main(String[] args) {
//        Write a for loop to add odd numbers
//        between 1 and 10
//        print the result at the end.
//        1+3+5+7+9
        int total = 0;
        for (int i = 1; i <= 9; i = i + 2) {
            total = total + i;
        }
        System.out.println("Total is " + total);
    }
}
