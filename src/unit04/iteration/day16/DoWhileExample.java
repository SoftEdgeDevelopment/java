package unit04.iteration.day16;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        String secretCode = "secret";
        String secretInput;
        do {
            System.out.println("Enter the secret code");
            Scanner input = new Scanner(System.in);
            secretInput = input.nextLine();
        } while (!secretCode.equals(secretInput));

        System.out.println("Congrats, you found the secret code!");
    }
}
