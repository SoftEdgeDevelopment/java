package javaprojects.project05;

import java.util.Scanner;

//write a program that will print out last letter of the word (string) entered by user
public class Assignment03 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner scanner = new Scanner(System.in);
        //prompt user to enter a word
        System.out.print("Enter a word: ");
        //get user input for word
        String word = scanner.nextLine();
        //new char variable to get the last letter using the getLastLetter method
        char lastLetter = getLastLetter(word);
        //display the last letter in the users word
        System.out.println("The last letter is: " + lastLetter);
    }
    //new method to return a char getLastLetter of the word
    public static char getLastLetter(String word) {
        //new int length to get the length of the word
        int length = word.length();
        //return the char at the length - 1 to get the last letter index
        return word.charAt(length - 1);
    }
}
