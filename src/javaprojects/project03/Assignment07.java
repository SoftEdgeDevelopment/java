package javaprojects.project03;

import java.util.Scanner;

//get user input as a String and find the middle character of the String
public class Assignment07 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner in = new Scanner(System.in);
        //prompt user to input a string
        System.out.println("Input a word: ");
        //get user input as String
        String str = in.nextLine();
        System.out.println("The middle character in the string: "+middle(str));
    }

    //new method to return the position of the middle
    public static String middle(String str) {
        //new int for position of the char in the middle and length of string
        int position;
        int length;
        //if the remaining length of the string after being divided by 2 is 0 (string evenly cuts in half)
        if (str.length() % 2 == 0) {
            //the position equals half of the string minus 1
            position = str.length() / 2 - 1;
            //the length changes to 2 because it will get 2 characters from an evenly cut string
            length = 2;
            //else the string cuts perfectly with a single remaining char in the middle
        } else {
            //the position of the char is half of the strings length
            position = str.length() / 2;
            //the length equals 1 char
            length = 1;
        }
        //return the value substring to the String of the position, and the position + length, (half the string + char in the half)
        return str.substring(position, position + length);
    }
}
