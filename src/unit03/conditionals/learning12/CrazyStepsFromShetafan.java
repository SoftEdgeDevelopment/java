package unit03.conditionals.learning12;
//get user input and check true or false if they pass
import java.util.Scanner;

public class CrazyStepsFromShetafan {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user
        System.out.println("How many steps you have today, Shetafan, Dont Lie!");
        //new int variable for user input - amount of steps taken
        int steps = input.nextInt();
        //new boolean reached goal - true or false
        boolean reachedGoal;
        //to have reached goal, steps must be more than 7500
        reachedGoal = steps >= 7500;
        //displays if goal was reached or not
        System.out.println("Goal Reached: " + reachedGoal);
    }
}
