package javaprojects.project03;

import java.util.Scanner;
//use substring to combine certain data in the value 2 strings
public class Assignment11{
    public static void main(String[] args) {
        // create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter the first string
        System.out.print("Enter the first string (at least 6 characters): ");
        // read the user's input and store it in a String variable called firstString
        String firstString = scanner.nextLine();
        // prompt the user to enter the second string
        System.out.print("Enter the second string (at least 6 characters): ");
        // read the user's input and store it in a String variable called secondString
        String secondString = scanner.nextLine();
        // check if either string is less than 6 characters long
        if (firstString.length() < 6 || secondString.length() < 6) {
            // print "Invalid data" and terminate the program if either string is too short
            System.out.println("Invalid data");
            return;
        }
        // combine the first 4 characters of the first string with the last 3 characters of the second string and add "@gmail.com" to the end
        //get substring 0,4 for first string to get first 4 chars,
        //get substring (begin index - second substring - 3) to get the substring location of the start of the last 3 chars
        String combinedString = firstString.substring(0, 4) + secondString.substring(secondString.length() - 3) + "@gmail.com";
        // convert the combined string to lowercase and store it in a new String variable called email
        String email = combinedString.toLowerCase();
        // print the final email address to the console
        System.out.println("Your email: " + email);
    }
}
