package unit03.conditionals.day12;

import java.util.Scanner;
//practice with prompting user and display results with if statements
public class IfPractice {
    public static void main(String[] args) {
        //new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user
        System.out.println("How many steps today");
        //get the users input as an int variable
        int steps = input.nextInt();
        //checks if the steps are greater than or equal to 7500
        if(steps >= 7500){
            //if greater than or equal to 7500
            System.out.println("You just reached your goal. Congrats!");
        }
        //checks if the steps are less than 7500
        if(steps<7500){
            //if less than 7500
            System.out.println("Don't lose heart. Keep walking.");
        }
        //displays this message at the end of the if statement
        System.out.println("Healthy Life Rocks!");
    }
}
