package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 2 strings, stores them in an array, and prints the merged element
public class Assignment19 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare a string array with size 2 to store user-entered strings
        String[] arr = new String[2];
        //prompt the user to enter 2 strings
        System.out.println("Enter 2 strings (press enter after each):");
        //read 2 strings entered by user and store them in the array
        for (int i = 0; i < 2; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        //call the getMerged method to merge the elements in the array
        String merged = getMerged(arr);
        //print the result
        System.out.println("The merged element is: " + merged);
    }

    //method to merge the elements in the array
    public static String getMerged(String[] arr) {
        //initialize variables for the first and second words
        String first = arr[0];
        String second = arr[1];
        //check if the first word ends with the same letter as the second word starts with
        if (first.charAt(first.length() - 1) == second.charAt(0)) {
            //if true, merge the words by removing the duplicate letter
            return first + second.substring(1);
        } else {
            //if false, merge the words normally
            return first + second;
        }
    }
}
