package unit04.iteration.day17;
//for loop to write the sum of the numbers from 1-5
public class SumOfNumbers {
    public static void main(String[] args) {
//        Write a for loop to find
//        the sum of the numbers between 1 and 5.

        //new int variable sum starting from 0
        int sum = 0;
        //starting from 1 until 5, add 1
        for (int i = 1; i <=5 ; i++) {
            //print the sum
            System.out.println(sum);
            //sum = sum + i
            //(0+1)(1+2)(3+3)(6+4)(10+5) = 15
            sum = sum + i;
        }
        //display the total (15)
        System.out.println("result: " + sum);

    }
}
