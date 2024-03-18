package javaprojects.project06;

import java.util.Scanner;

/**
 * This program prompts the user to enter a main string and a specific word,
 * and then finds and returns the substring that is between the first and last
 * appearance of the specified word within the main string. If the specified word
 * does not appear at least twice, the program returns "nothing". This allows for
 * flexible searches within any given string for any specified word, making it
 * useful for extracting content between repeated patterns or markers.
 */
public class Assignment02 {

    public static void main(String[] args) {
        // Declare the variables
        String input, word;

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the main string
        System.out.println("Enter the main string: ");
        input = scanner.nextLine();

        // Prompt the user for the word
        System.out.println("Enter the word: ");
        word = scanner.nextLine();

        // Call the method and print the result
        System.out.println("Output: " + getInbetween(input, word));
    }

    // Updated method to accept the word as a parameter
    public static String getInbetween(String str, String word) {
        // Finding the index of the first and last occurrence of the word
        int firstWordEndIndex = str.indexOf(word) + word.length();
        int lastWordStartIndex = str.lastIndexOf(word);

        // Check if there are at least two occurrences of the word
        if (firstWordEndIndex < lastWordStartIndex) {
            // Return the string in between
            return str.substring(firstWordEndIndex, lastWordStartIndex);
        } else {
            // Return "nothing" if there are not two occurrences of the word
            return "nothing";
        }
    }
}


