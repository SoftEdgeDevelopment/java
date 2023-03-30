package unit03.conditionals.day12;

import java.util.Scanner;
//get user input for true or false statement
public class PartyCheck {
    public static void main(String[] args) {
        //new scanenr for user input
        Scanner input = new Scanner(System.in);
        //prompt the user for age
        System.out.println("How old are you?");
        //new int variable for user input age
        int age = input.nextInt();
        //new boolean true or false if user can goto a party
        boolean canGoToParty;
        //if the user is over or equal to 18, true
        canGoToParty = age >= 18;
        //displays true or false if user can goto party
        System.out.println("Can go to party: " + canGoToParty);
    }
}
