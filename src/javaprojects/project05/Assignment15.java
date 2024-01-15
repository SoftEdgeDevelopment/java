package javaprojects.project05;

import java.util.Scanner;

public class Assignment15 {

    //method to concatenate a String and return the first + last letter (ex. friends = fs)
    public static void main(String[] args) {
        //declare variables
        String word;

        //create Scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter the word
        System.out.print("Enter the word: ");
        //get user input and store it into word String
        word = scanner.nextLine();

        //call the method to get and print the first and last letters
        System.out.println(getFirstAndLast(word));
    }

    //method to get the first and last letters of the word
    private static String getFirstAndLast(String word) {
        //check if the word is not empty
        if (word.length() > 0) {
            //concatenate the first and last letters and return the result
            //index of the first char + index of the last char (word.length -1)
            return word.charAt(0) + "" + word.charAt(word.length() - 1);
        } else {
            //return an empty string if the word is empty
            return "no input detected";
        }

    }
}

