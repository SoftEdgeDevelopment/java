package javaprojects.project03;

import java.util.Scanner;
//get user input and check if the string contains anything, convert all to upper case
public class Assignment02 {
    //A person will enter their address into a String. Make sure the String is not empty. You
    //should check the variable manually.
    //If it is empty: print: "No address found".
    //If there is an address : make all the text uppercase to match the expected format
    public static void main(String[] args) {
        //create new scanner for users input
        Scanner input = new Scanner(System.in);
        //prompt the user to input their address
        System.out.println("input your address name");
        //new String variable to get user input for address
        String address = input.nextLine();
        //checks if anything is contained in the String
        if (address.isEmpty()){
            //if nothing was entered, no address is found
            System.out.println("No address found");
        }
        //else if something was entered
        else{
            //converts all chars in the string to upper case letters
            address.toUpperCase();
            //prints the address
            System.out.println("the address is " + address);
        }
    }
}
