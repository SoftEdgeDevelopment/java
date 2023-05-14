package javaprojects.project04;

import java.util.Scanner;

//get 3 different numbers from the user and check which one is the greatest
public class Assignment17 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter 3 differnt numbers
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Enter number 3");
        int num3 = input.nextInt();
        //checks which number is the greatest
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 - " + num1 + " is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 - " + num2 + " is the greatest");
        }
        else{
            System.out.println("num3 - " + num3 + " is the greatest");
        }
    }
}

