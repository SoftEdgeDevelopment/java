package unit01.primitive.types.day05;

import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the month, today?");
        int dayOfTheMonth = input.nextInt();
        System.out.print("Today is the ");
        System.out.println(dayOfTheMonth);
        System.out.println("Which month is it?");
//        Workaround nextLine problem is to put another nextLine
        input.nextLine();
        String month = input.nextLine();
        System.out.print("Month: ");
        System.out.println(month);
    }
}
