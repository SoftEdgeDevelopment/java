package javaprojects.project06;

import java.util.Scanner;

//method that parses a JSON string and prints out the first name and last name

public class Assignment06 {

    //method to extract and print first name and last name from JSON string
    public static void getName(String json) {
        //find the indices of the first and last name fields
        int firstNameIndex = json.indexOf("\"firstName\":") + "\"firstName\":".length();
        int lastNameIndex = json.indexOf("\"lastName\":") + "\"lastName\":".length();

        //extract first name
        int firstNameStartIndex = json.indexOf("\"", firstNameIndex) + 1;
        int firstNameEndIndex = json.indexOf("\"", firstNameStartIndex);
        String firstName = json.substring(firstNameStartIndex, firstNameEndIndex);

        //extract last name
        int lastNameStartIndex = json.indexOf("\"", lastNameIndex) + 1;
        int lastNameEndIndex = json.indexOf("\"", lastNameStartIndex);
        String lastName = json.substring(lastNameStartIndex, lastNameEndIndex);

        //print first name and last name
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }

    public static void main(String[] args) {
        //declare variables
        String json;
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter the JSON string: ");
        json = scanner.nextLine();

        //call getName method
        getName(json);

        //close scanner
        scanner.close();
    }
}
