package javaprojects.project04;

import java.util.Scanner;

//switch example for user input to display the month of the year
public class Assignment19 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter the month as a number
        System.out.println("What number month is it");
        //get user input for the month as an int
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
        }
    }
}
