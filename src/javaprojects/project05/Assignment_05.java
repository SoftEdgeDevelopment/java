package javaprojects.project05;

import java.util.Scanner;

public class Assignment_05 {
    //write a program to reverse a string
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to input name
        System.out.println("Enter your name");
        //new String for name to store user input
        String name = input.nextLine();
        //call to the getReversedString method with the name
        getReversedString(name);
    }
    //new void method to get the reversed version of a String
    public static void getReversedString(String word){
        //starting from the words ending letter, until the first letter, subtract 1
        for (int i = word.length() - 1; i >= 0; i--) {
            //display each char to print the full string backwards
            System.out.print(word.charAt(i));
        }
    }
}
