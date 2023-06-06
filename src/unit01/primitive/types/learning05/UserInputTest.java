package unit01.primitive.types.learning05;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {
        //practice with user input, scanner and nextLine
        //new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for the date
        System.out.println("What day of the month is today?");
        //get user input as a whole number
        int dayOfTheMonth = input.nextInt();
        //display the day and text based on user input
        System.out.print("Today is the ");
        System.out.println(dayOfTheMonth);
        //prompt user for the month
        System.out.println("Which month is it?");
//        Workaround nextLine problem is to put another nextLine
        input.nextLine();
        //get user input as String for the month
        String month = input.nextLine();
        //display the text and user input for month
        System.out.print("Month: ");
        System.out.println(month);
    }
}
