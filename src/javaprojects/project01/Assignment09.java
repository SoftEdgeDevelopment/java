package javaprojects.project01;

import java.util.Scanner;

public class Assignment09 {
    //first and second are already declared
    //write a single statement that will print the message "first is" followed by the value of first
    //and then a space, followed by "second=", followed by the value of second
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //get user input for first
        int first = input.nextInt();
        //get user input for second
        int second = input.nextInt();
        //print to console with the following statement above
        System.out.println("first is" + first + " " + "second=" + second);
    }
}