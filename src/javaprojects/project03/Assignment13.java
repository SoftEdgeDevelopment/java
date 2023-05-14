package javaprojects.project03;

import java.util.Scanner;

//prompts the user to enter their first and last names, generates an ID from these inputs using the specified format, and prints the ID to the console
public class Assignment13 {
    // Ask user to enter his first name and last name in String. Write your code to return an ID
    //(String) using the following format:
    //- the first letter of the first name as lowercase,
    //- the first 3 letters of the last name with the first letter as uppercase and the rest
    //lowercase,
    //- the length of the first String multiplied by 2
    public static void main(String[] args) {
        // create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter their first name
        System.out.print("Enter your first name: ");
        // read the user's input and store it in a String variable called firstName
        String firstName = scanner.nextLine();
        // prompt the user to enter their last name
        System.out.print("Enter your last name: ");
        // read the user's input and store it in a String variable called lastName
        String lastName = scanner.nextLine();
        // declare an empty String variable called id
        String id = "";
        // add the first letter of the first name in lowercase to the id
        id += firstName.substring(0, 1).toLowerCase();
        // add the first letter of the last name in uppercase to the id
        id += lastName.substring(0, 1).toUpperCase();
        // add the first three letters of the last name in lowercase to the id
        id += lastName.substring(1, Math.min(lastName.length(), 3)).toLowerCase();
        // add the length of the first name multiplied by 2 to the id
        id += firstName.length() * 2;
        // print the generated ID to the console
        System.out.println("ID: " + id);
    }
}
