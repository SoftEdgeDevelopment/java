package javaprojects.project05;

import java.util.Scanner;

public class Assignment07 {
//method to print the 3 middle letters of a string
    public static void main(String[] args) {
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a word
        System.out.print("Enter a word: ");
        //read the input word from the user
        String word = scanner.next();
        //check if the word has odd length and at least 5 characters
        if (word.length() % 2 != 0 && word.length() >= 5) {
            //call the getMiddleChars method to get the middle three characters
            String middleChars = getMiddleChars(word);
            //print the middle three characters of the word
            System.out.println("Middle three characters: " + middleChars);
        } else {
            //print a message indicating that the word does not meet the criteria
            System.out.println("Invalid");
        }
    }
    // method to get the middle three characters of a word
    public static String getMiddleChars(String word) {
        //calculate the index of the middle character by getting the length of the word / 2
        int midIndex = word.length() / 2;
        //return the middle three characters of the word by getting the middle index - 1 and the middle index + 2 as substrings
        return word.substring(midIndex - 1, midIndex + 2);
    }
}

