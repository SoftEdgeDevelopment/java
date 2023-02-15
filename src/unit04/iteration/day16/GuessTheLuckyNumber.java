package unit04.iteration.day16;

import java.util.Scanner;

public class GuessTheLuckyNumber {
    public static void main(String[] args) {
        int luckyNumber = 15;
        int inputNumber;
        do {
            System.out.println("Whats the lucky number");
            Scanner scan = new Scanner(System.in);
            inputNumber = scan.nextInt();
        } while (luckyNumber != inputNumber);

        System.out.println("Congrats");
    }
}

