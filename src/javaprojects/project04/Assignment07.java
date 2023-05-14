package javaprojects.project04;

import java.util.Scanner;
//get user input and check if the number is positive, negative, or zero
public class Assignment07 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a number
        System.out.println("Input a number");
        //get user input and store as int num1
        int num = input.nextInt();
        //check if the number is positive
        if (num > 0){
            System.out.println(num + " is positive");
        }
        else if(num < 0){
            System.out.println(num + " is negative");
        }
        else{
            System.out.println(num + " is zero");
        }
    }
}
