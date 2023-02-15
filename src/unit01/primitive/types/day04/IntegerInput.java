package unit01.primitive.types.day04;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What year is this?");
        int year;
        year = input.nextInt();
        System.out.println("You entered");
        System.out.println(year);

    }
}
