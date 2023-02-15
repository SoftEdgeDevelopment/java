package unit03.conditionals.day12;

import java.util.Scanner;

public class CrazyStepsFromShetafan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many steps you have today, Shetafan, Dont Lie!");
        int steps = input.nextInt();
        boolean reachedGoal;

        reachedGoal = steps >= 7500;

        System.out.println("Goal Reached: " + reachedGoal);
    }
}
