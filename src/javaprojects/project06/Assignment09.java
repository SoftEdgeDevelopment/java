package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 5 strings, stores them in an array, and prints the first 3 letters of each string
public class Assignment09 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare a string array with size 5 to store user-entered strings
        String[] arr = new String[5];
        //prompt the user to enter up to 5 strings
        System.out.println("Enter up to 5 strings (press enter after each):");
        //read up to 5 strings entered by user and store them in the array
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        //call the getWord method to print the first 3 letters of each string in the array
        getWord(arr);
    }

    //method to print the first 3 letters of each string in the array
    public static void getWord(String[] arr) {
        //loop through each string in the array
        for (String word : arr) {
            //check if the string is not null and has at least 3 characters
            if (word != null && word.length() >= 3) {
                //print the first 3 letters of the string
                System.out.println(word.substring(0, 3));
            }
        }
    }
}
