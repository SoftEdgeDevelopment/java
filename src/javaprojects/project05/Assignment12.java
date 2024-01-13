package javaprojects.project05;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {
        //declare guestList variable starting empty
        String guestList = "";

        //create Scanner object
        Scanner userInput = new Scanner(System.in);

        //call the getGuestList method and display the result
        System.out.println("Guest's List: " + getGuestList(userInput, guestList));
    }

    //method to get the guest list
    public static String getGuestList(Scanner scanner, String currentGuestList) {

        String answer; //declare answer outside the loop

        do {
            //prompt message for entering guest name
            System.out.println("Please enter guest name:");
            //get user input for guest name
            String name = scanner.next();

            //add the guest name to the current guest list
            currentGuestList += name;

            //prompt message for entering new guest name
            System.out.println("Do you want to enter a new guest name? (yes/no)");
            answer = scanner.next(); // Assign to the variable declared outside the loop

            //add comma and space if more guests are expected
            if (answer.equalsIgnoreCase("yes")) {
                currentGuestList += ", ";
            }

        } while (answer.equalsIgnoreCase("yes"));

        //return the final guest list
        return currentGuestList;
    }
}
