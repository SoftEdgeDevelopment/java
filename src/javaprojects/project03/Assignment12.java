package javaprojects.project03;

import java.util.Scanner;
//write a code to replace the value of a char in a string with a new char
public class Assignment12 {
    public static void main(String[] args) {
        // new scanner for user input
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter a message
        System.out.print("Enter a message: ");
        // read the user's input and store it in a String variable called message
        String message = scanner.nextLine();
        // replace all occurrences of 'a' with 'e' in the message and store the result in a new String variable called newMessage
        String newMessage = message.replace('a', 'e');
        // print the original message to the console
        System.out.println("Original message: " + message);
        // print the modified message to the console
        System.out.println("New message: " + newMessage);
    }
}

