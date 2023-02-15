package unit04.iteration.day17;

public class SumOfNumbers {
    public static void main(String[] args) {
//        Write a for loop to find
//        the sum of the numbers between 1 and 5.

        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println(sum);
            sum = sum + i;
        }
        System.out.println("result: " + sum);

    }
}
