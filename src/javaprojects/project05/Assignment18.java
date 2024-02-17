package javaprojects.project05;

import java.util.Scanner;

public class Assignment18 {
    // method to find and print the longer word entered by the user
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter two words
        System.out.println("Enter two words:");
        // get the first word from user input
        String word1 = scanner.next();
        // get the second word from user input
        String word2 = scanner.next();

        // print a message
        System.out.println("Output:");
        // print the longer word by calling to the getLongerWord method
        System.out.println(getLongerWord(word1, word2));

        // close the scanner to prevent resource leak
        scanner.close();
    }

    // method to get the longer word
    public static String getLongerWord(String word1, String word2) {
        // use ternary expression to return the longer word to the method
        return (word1.length() > word2.length()) ? word1 : word2;
    }
}
