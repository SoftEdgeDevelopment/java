package javaprojects.project04;

import java.util.Scanner;

public class Assignment13 {
    //get user input and check if a number is odd or even or zero
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to input a number
        System.out.print("In : ");
        //store user input into int num
        int num = input.nextInt();
        //checks if the remainder after being divided by 2 is zero - even
        if (num % 2 == 0) {
            System.out.println(num + " : is even");
        }
        //else its odd
        else {
            System.out.println(num + " : is odd");
        }
    }
}
