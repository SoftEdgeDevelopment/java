package javaprojects.project01;

import java.util.Scanner;

public class Assignment08 {
    //Assume the word is a string variable and already has a value
    //write a statement to display the message "Today's-Of-The-Day is:" followed by
    //the value of a word from users input
    //the message and value should appear on a single line
    //"Today's-Of-The-Day is:(user input)"
    public static void main(String[] args) {
        //create a scanner for user input
        Scanner input = new Scanner(System.in);
        String word1 = "Today's-Of-The-Day is : ";
        String word2 = input.nextLine();
        System.out.println(word1+word2);
    }
}
