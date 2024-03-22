package javaprojects.project06;

import java.util.Scanner;

//checks if the number of appearances of "java" is equal to the number of appearances of "python" in a given string

public class Assignment03 {

    //method to check equality of appearances of "java" and "python" in a string
    public static boolean isEqual(String input) {
        //count occurrences of "java" and "python"
        int javaCount = input.split("java", -1).length - 1;
        int pythonCount = input.split("python", -1).length - 1;

        //check if counts are equal
        return javaCount == pythonCount;
    }

    public static void main(String[] args) {
        //declare variables
        String input;
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter a string: ");
        input = scanner.nextLine();

        //call isEqual method and print result
        System.out.println(isEqual(input));

        //close scanner
        scanner.close();
    }
}
