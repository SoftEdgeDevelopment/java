package unit03.conditionals.learning14;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
/*        Dice game
        Roll dice two times
        if you roll the same number twice or the total number of dice is greater than
        or equal to 8 you win.
        otherwise lose*/
//        Random dice = new Random();
//        int dice1 = dice.nextInt(1, 7);
//        System.out.println(dice1);
        //new Random generator object
        Random randomNumberGenerator = new Random();
        //new int variable using random generator, 2 parameters, origin - start number, bound - limit 7 = (6 max)
        int firstDice = randomNumberGenerator.nextInt(1, 7);
        //new variables for rolling 2 dice
        int dice1;
        int dice2;
        //cast to integer variable to get whole random number between 1-6 for variables dice1-2
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        //display the output of dice 1 and 2
        System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);

        //if dice1 value equals dice2 or dice1 value plus dice2 is greater than or equal to 8
        if (dice1 == dice2 || (dice1 + dice2) >= 8) {
            //you win
            System.out.println("Congrats. You won!");
            //else you lost
        } else {
            System.out.println("You lose. Try Again.");
        }

    }
}
