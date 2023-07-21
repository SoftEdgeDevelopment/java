package javaprojects.project05;

import java.util.Scanner;

public class Assignment06 {
    //Write a program that will verify if word is available in the sentence.
    //Print out the result as a boolean value
    public static void main(String[] args) {
        //prompt user
        System.out.println("Verify if apple is available in a message");
        System.out.println("Enter a message");
        //call to the isContainWord() method to check if the word is contained in the users input
        System.out.println(isContainWord());
    }
    public static boolean isContainWord(){
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new String for the search word
        String searchWord = "apple";
        //new String for users input
        String userInput = input.nextLine();
        //if the users input contains searchWord
        if(userInput.contains(searchWord)){
            //return true to isContainWord() method
            return true;
        }
        //return false to isContainWord() method
        return false;
    }
}
