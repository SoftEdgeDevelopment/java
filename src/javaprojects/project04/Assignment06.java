package javaprojects.project04;

import java.util.Scanner;
//prompt user to input 2 numbers and check if the first is greater than, less than, or equal to the second
public class Assignment06 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter a number
        System.out.println("Enter number 1");
        //store user input as num1
        int num1 = input.nextInt();
        //prompt the user to enter a second number
        System.out.println("Enter Number 2");
        //store user input as num2
        int num2 = input.nextInt();
        //checks if num1 is greater than num2
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        //checks if num1 is less than num2
        else if(num1 < num2 ){
            System.out.println(num1 + " is less than " + num2);
        }
        //checks if both numbers are equal
        else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }
}
