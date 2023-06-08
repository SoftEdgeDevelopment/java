package unit04.iteration.learning16;

import java.util.Scanner;
//do while loop to guess a lucky number
public class GuessTheLuckyNumber {
    public static void main(String[] args) {
        //new variable for lucky number
        int luckyNumber = 15;
        //new variable to store user input
        int inputNumber;
        //new scanner to get user input
        Scanner scan = new Scanner(System.in);
        //create a do while loop
        do {
            //prompt the user for input
            System.out.println("Whats the lucky number");
            //get users input
            inputNumber = scan.nextInt();
            //while user input does not equal lucky number, repeat the do loop
        } while (luckyNumber != inputNumber);
        //display congrats if they got the number
        System.out.println("Congrats");
    }
}

