package javaprojects.project05;

import java.util.Scanner;

public class Assignment01 {
    //write a program that will print a week day according to the day number
    public static void main(String[] args) {
        //prompt user to input a number for the day of the week
        System.out.println("Enter a week day 1-7");
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new int for weekDay to get as user input
        int weekDay = input.nextInt();
        //new switch for weekDay
        switch (weekDay){
            //case 1-7 displays the day of the week accordingly
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                //default if none of the case choices were selected
            default:
                System.out.println("Invalid Choice");
                //break after each case to finish the code
                break;
        }
    }
}
