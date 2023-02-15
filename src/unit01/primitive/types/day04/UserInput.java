package unit01.primitive.types.day04;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name;
        name = input.nextLine();
        System.out.println("You entered");
        System.out.println(name);
    }
}
