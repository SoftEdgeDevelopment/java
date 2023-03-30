package unit03.conditionals.day13;

import java.util.Scanner;
//get user input and check if, else if, else for if the number is positive, negative, or zero
public class PositiveNegative {
    public static void main(String[] args) {
//        declare an int and assign a number
//        check if it is positive and print positive
//        check if it is negative and print negative
//        else print 0
//        int someNumber = new Scanner(System.in).nextInt();
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user for an int number
        System.out.println("input a whole number");
        //get user input as an int
        int num = input.nextInt();
        //new if statement to check if the number is positive
        if(num > 0){
            //if greater than 0, the number is positive
            System.out.println("the number is positive");
        }
        //else if num is less than 0
        else if(num < 0){
            //the number is negative
            System.out.println("the number is negative");
        }
        //else if the number is not greater than or less than 0
        else{
            //the number is zero
            System.out.println("the number is zero");
        }
    }
}
