package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 8 strings, stores them in an array, and prints pairs of elements in the specified format
public class Assignment15 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare a string array with size 8 to store user-entered strings
        String[] arr = new String[8];
        //prompt the user to enter up to 8 strings
        System.out.println("Enter up to 8 strings (press enter after each):");
        //read up to 8 strings entered by user and store them in the array
        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        //call the getPairs method to print pairs of elements from the array
        getPairs(arr);
    }

    //method to print pairs of elements from the array
    public static void getPairs(String[] arr) {
        //loop through the array in steps of 2 to form pairs
        for (int i = 0; i < arr.length; i += 2) {
            //print the current pair of elements
            System.out.println(arr[i] + " , " + arr[i + 1]);
        }
    }
}
