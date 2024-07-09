package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 8 strings, stores them in an array, and prints the element with the longest length
public class Assignment18 {
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
        //call the getLongestWord method to find the element with the longest length in the array
        String longestWord = getLongestWord(arr);
        //print the result
        System.out.println("The element with the longest length is: " + longestWord);
    }

    //method to find the element with the longest length in the array
    public static String getLongestWord(String[] arr) {
        //initialize variable to store the longest word
        String longestWord = "";
        //loop through each element in the array
        for (String word : arr) {
            //update longestWord if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        //return the longest word
        return longestWord;
    }
}
