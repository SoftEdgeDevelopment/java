package javaprojects.project02;

public class Assignment01 {
    //write a program to print the sum of the digits of a given number
    //example:
    //int num = 123
    //output = 6
    public static void main(String[] args) {
        //number you want to add
        int num = 123;
        //create a sum starting with 0
        int sum;
        //start at zero
        sum = 0;
        //num(123) % 10 will give 3 remainder and add 3 to the sum (0) - total is 3
        sum += num % 10;
        //divide num(123) by 10, remove last digit because no remainders can be left - total is 12
        num /= 10;
        //num(12) divided by 10, no remainder so total - 2, add to the sum(3) total is now 5
        sum += num % 10;
        //finally num divided to 10 again = 1 + sum(5) = 6
        num /= 10;
        //add sum and num for final
        sum += num;
        //print to console
        System.out.println("the sum of the digits is " + sum);
    }
}
