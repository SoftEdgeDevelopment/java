package javaprojects.project05;

import java.util.Scanner;
//compares the value of the variables using ternary operator
public class Assignment02 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner scanner = new Scanner(System.in);
        //prompt the user to input 2 numbers
        System.out.println("Enter two numbers: ");
        //get user input for num1 and num2
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //using ternary operator, check the larger number and assign the value of largerNum to num1 if true or num2 if false
        int largerNumber = (num1 > num2) ? num1 : num2;
        //display which is the larger number
        System.out.println("The larger number is: " + largerNumber);
    }
}
