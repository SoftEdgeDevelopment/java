package unit03.conditionals.day13;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to make a menu selection
        System.out.println("---Please Input A Selection From The Menu---");
        System.out.println("1 - Hamburger Menu");
        System.out.println("2 - Pizza Menu");
        System.out.println("3 - French Fries Menu");
        System.out.println("4 - French Fries Menu");
        System.out.println("5+ - Daily Special");
        System.out.println("---------------");
        //get user input as int for menu selection
        int selection = input.nextInt();
//        1-4
//
        //new switch with int as parameter
        switch (selection){
            //for case 1
            case 1:
                //display user choice
                System.out.println("You select Hamburger Menu");
                //break after each case to return to switch
                break;
                //repeat process for case 2-4
            case 2:
                System.out.println("You select Pizza Menu");
                break;
            case 3:
                System.out.println("You select French Fries Menu");
                break;
            case 4:
                System.out.println("You select Cheeseburger Menu");
                break;
                //after case selection
            //default if no case selection has been made, this will run
            default:
                System.out.println("You select the Daily Special");
                break;
        }
    }
}
