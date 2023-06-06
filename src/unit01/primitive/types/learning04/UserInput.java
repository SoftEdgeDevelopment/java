package unit01.primitive.types.learning04;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //prompt user and get user input
        //new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for their name
        System.out.println("Enter your name");
        //new String variable for name because value will be text
        String name;
        //get value as String for name from user input
        name = input.nextLine();
        //display message with users String input as name
        System.out.println("You entered");
        System.out.println(name);
    }
}
