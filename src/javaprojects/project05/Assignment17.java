package javaprojects.project05;

import java.util.Scanner;

public class Assignment17 {
    //method that calculates the factorial of a given number entered by the user
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter a number
        System.out.println("Enter a number:");
        // read the input number
        int number = scanner.nextInt();

        System.out.println("Output:");
        // calculate and print the factorial calling to the getResult method with user input for number
        System.out.println(number + "! = " + getResult(number));
        // close the scanner to prevent resource leak
        scanner.close();
    }

    // method to calculate factorial
    public static long getResult(int n) {
        // check if n is 0 or 1
        if (n == 0 || n == 1) {
            // return 1 if n is 0 or 1
            return 1;
        }
        // initialize factorial variable to 1
        long factorial = 1;
        // loop from 2 to n
        for (int i = 2; i <= n; i++) {
            // multiply factorial by i
            factorial *= i;
        }
        // return the calculated factorial
        return factorial;
    }
}


