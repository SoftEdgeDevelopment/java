package unit03.conditionals.day12;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many steps today");
        int steps = input.nextInt();

        if(steps >= 7500){
            System.out.println("You just reached your goal. Congrats!");
        }
        if(steps<7500){
            System.out.println("Don't lose heart. Keep walking.");
        }
        System.out.println("Healthy Life Rocks!");
    }
}
