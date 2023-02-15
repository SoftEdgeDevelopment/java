package unit03.conditionals.day14;

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
        Random randomNumberGenerator = new Random();
        int firstDice = randomNumberGenerator.nextInt(1, 7);
        int dice1;
        int dice2;
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);

        if (dice1 == dice2 || (dice1 + dice2) >= 8) {
            System.out.println("Congrats. You won!");
        } else {
            System.out.println("You lose. Try Again.");
        }

    }
}
