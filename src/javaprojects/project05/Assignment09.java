package javaprojects.project05;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Assignment09 {
    public static void main(String[] args) {
        //create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email input, first and last name separated by \"_\" ");
        //read the email provided by the user
        String email = scanner.nextLine();
        //call the getInfo() method to process the email and print the information
        getInfo(email);
    }
    public static void getInfo(String email) {
        //find the index of "@" in the email
        int atIndex = email.indexOf("@");
        //find the last index of "." in the email
        int dotIndex = email.lastIndexOf(".");

        //extract the first name from the email and capitalize the first letter
        String firstName = capitalizeFirstLetter(email.substring(0, email.indexOf("_")));
        //extract the last name from the email and capitalize the first letter
        String lastName = capitalizeFirstLetter(email.substring(email.indexOf("_") + 1, atIndex));
        //extract the domain from the email
        String domain = email.substring(atIndex + 1, dotIndex);
        //extract the top-level domain from the email
        String topLevelDomain = email.substring(dotIndex + 1);

        //print the first name
        System.out.println("First name: " + firstName);
        //print the last name
        System.out.println("Last name: " + lastName);
        //print the domain
        System.out.println("Domain: " + domain);
        //print the top-level domain
        System.out.println("Top-level domain: " + topLevelDomain);
    }

    private static String capitalizeFirstLetter(String input) {
        //capitalize the first letter of the input string
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}



