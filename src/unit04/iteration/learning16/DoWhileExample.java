package unit04.iteration.learning16;

import java.util.Scanner;
//getting the correct password with a do while loop
public class DoWhileExample {
    public static void main(String[] args) {
        //create new variable for a secret password
        String secretCode = "secret";
        //create a new variable for a secret input
        String secretInput;
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //do - will be executed at least one time
        //depending on the boolean statement, it will be repeated
        do {
            //prompt the user to enter a password until it is correct
            System.out.println("Enter the secret code");
            //get the user input and assign it to the secretInput String value
            secretInput = input.nextLine();
            //while the secret password does not match the user input, do the loop again
        } while (!secretCode.equals(secretInput));
        //will display this when the do while loop is finished
        System.out.println("Congrats, you found the secret code!");
    }
}
