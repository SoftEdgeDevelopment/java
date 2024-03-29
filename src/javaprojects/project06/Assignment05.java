package javaprojects.project06;

import java.util.Scanner;

//method that prints a stars triangle based on the integer entered by the user
public class Assignment05 {

    //method to print the stars triangle
    public static void getTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //declare variables
        int n;
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        //call getTriangle method
        getTriangle(n);

        //close scanner
        scanner.close();
    }
}
