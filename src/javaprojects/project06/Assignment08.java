package javaprojects.project06;

// import scanner class for user input
import java.util.Scanner;


public class Assignment08 {
    //method that displays each digit in the users input
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //prompt the user for input
        System.out.println("Enter your number:");
        //read the integer input from user
        int number = scanner.nextInt();
        scanner.close();
        //call the getDigits method with the input number
        getDigits(number);
    }

    //method to slice an integer into digits and print each digit on a new line
    public static void getDigits(int number) {
        //convert number to string to easily access each digit
        String numStr = Integer.toString(number);
        //loop through each character in the string (each digit)
        for (int i = 0; i < numStr.length(); i++) {
            //convert character back to integer and print
            int digit = Character.getNumericValue(numStr.charAt(i));
            System.out.println("Display promt: " + digit);
        }
    }
}
