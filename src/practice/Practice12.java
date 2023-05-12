package practice;

import java.sql.SQLOutput;
import java.util.Scanner;
//give the user 10 tries to guess the random number between 1-100
public class Practice12 {
    //Write a code to generate a random number 1-100
    //ask the user to guess the number
    //give the user 10 attempts
    //if the guess is too high tell the user, or if it is too low as well until the number is guessed correct
    //or if the user runs out of tries
    public static void main(String[] args) {
        //new int for random number 1-100
        int randomNumber = (int) (Math.random() * 100) + 1;
        //new int for number of attempts
        int attempts = 10;
        //new scanner to get user input
        Scanner input = new Scanner(System.in);
        //prompt the user to guess the random number
        System.out.println("Try to guess the MAGIC number");
        //new while loop, will run as long as attempts are more than 0
        while (attempts > 0) {
            //get the users answer as an int
            int userAnswer = input.nextInt();
            if (userAnswer == randomNumber) {
                System.out.println("Congrats! You Win! :" + randomNumber + " was the MAGIC NUMBER!");
            } else if (userAnswer > randomNumber) {
                System.out.println("You guessed too high!");
                attempts--;
                System.out.println(attempts + " Attempts Remaining");
            } else {
                System.out.println("You guessed too low!");
                attempts--;
                System.out.println(attempts + " Attempts Remaining");
            }
            if (attempts == 0) {
                System.out.println("FAILED! NO MORE ATTEMPTS");
            }
        }
    }
}

