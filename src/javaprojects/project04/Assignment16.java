package javaprojects.project04;

import java.util.Scanner;
//gets user input for a food choice and displays total price or invalid choice if none selected
public class Assignment16
{
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter a Burger, Chicken, or Soda
        System.out.println("Pick an item from the menu");
        System.out.println("Burger - 10$");
        System.out.println("Chicken - 10$");
        System.out.println("Soda - 10$");
        //get user input as a String
        String userInput = input.nextLine();
        //if Burger or Chicken - price is 10
        if (userInput.equals("Burger") || userInput.equals("Chicken")){
            System.out.println("Total is 10$");
        }
        else if (userInput.equals("Soda")){
            System.out.println("Total is 2$");
        }
        else{
            System.out.println("invalid choice");
        }
        //if Soda  - price is 2
        //display the price after user input
    }
}