package javaprojects.project05;

import java.util.Scanner;
//method to count the number of times "cat" or "dog" is said in a single sentence and returns true or false if even amounts of times
public class Assignment14 {
    public static void main(String[] args) {
        //create Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // prompt user to enter the word
        System.out.print("Enter the word: ");
        // new String to store user input of the word
        String word = userInput.nextLine();

        //calling to the isCountEqual method using userInput check if the amount of times "cat" and "dog" is present are equal
        System.out.println(isCountEqual(word));
    }

    //method to check if the count of "cat" and "dog" is equal
    private static boolean isCountEqual(String word) {
        //declare variables to count occurrences of "cat" and "dog"
        int countOfCats = 0;
        int countOfDogs = 0;

        //initialize index for searching in the word
        int index = 0;

        //loop to count occurrences of "cat"
        while ((index = word.indexOf("cat", index)) != -1) {
            countOfCats++;
            index += "cat".length();
        }

        //reset index for searching "dog"
        index = 0;

        //loop to count occurrences of "dog"
        while ((index = word.indexOf("dog", index)) != -1) {
            countOfDogs++;
            index += "dog".length();
        }

        //return true if counts of "cat" and "dog" are equal, otherwise false
        return countOfCats == countOfDogs;
    }
}



