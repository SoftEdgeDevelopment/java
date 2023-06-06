package unit01.primitive.types.learning04;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        //get user input and display message
        //create new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for the year
        System.out.println("What year is this?");
        //new int variable year created
        int year;
        //get user input for int variable year (whole number)
        year = input.nextInt();
        //display message with new user input variable
        System.out.println("You entered");
        System.out.println(year);

    }
}
