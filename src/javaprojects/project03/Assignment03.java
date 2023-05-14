package javaprojects.project03;

import java.util.Scanner;

//checks user input if it begins with a specific thing and if the length is a specific amount
public class Assignment03 {
    //Declare a variable account number (String). You will check if these account numbers are
    //valid. You should check the variable manually.
    //- If the account number begins with a “2” the account number should be 7 characters long
    //Print: "Valid 7-digit account number"
    //Otherwise: "Invalid 7-digit account number"
    //- If the account number begins with a “5” the account number should be 10 characters long
    //Print: "Valid 5-digit account number"
    //Otherwise: "Invalid 5-digit account number"
    //- If the account number does not begin with a “2” or a “5”
    //Print: "Invalid account number
    public static void main(String[] args) {
        //create new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter a 7-digit account number
        System.out.println("---Enter 7 or 10 Digit Account Number---");
        //new string variable to get user input for account number
        String accountNumber = input.nextLine();
        //new boolean to check true or false if they begin with 2 or 5
        boolean twoDigit = accountNumber.startsWith("2");
        boolean fiveDigit = accountNumber.startsWith("5");
        //display if the account number starts with 2 or 5
        //System.out.println("the number starts with 2: " + twoDigit);
        //System.out.println("the number starts with 5: " + fiveDigit);
        //new boolean for valid account number if the number starts with 2 or 5
        boolean validAccountNumber = accountNumber.startsWith("2") || accountNumber.startsWith("5");
        //System.out.println("valid account number: " + validAccountNumber);
        //new booleans to check if the strings contain 7 or 10 chars
        boolean sevenChars = accountNumber.length() == 7;
        boolean tenChars = accountNumber.length() == 10;
        if (twoDigit && sevenChars){
            System.out.println("Valid 7-Digit Account Number");
        }
        else if(fiveDigit && tenChars){
            System.out.println("Valid 10-Digit Account Number");
        }
        else{
            System.out.println("Invalid Account, Try Again");
        }
    }
}
