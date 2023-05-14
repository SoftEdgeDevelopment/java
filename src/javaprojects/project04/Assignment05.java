package javaprojects.project04;

import java.util.Scanner;
//get user input for number of bedrooms and display the price of the rent
public class Assignment05 {
    //numberOfBedrooms variable already declared and assigned value using Scanner:
    //startingPrice variable is set to 0.
    //Using Multi Way If statement create this program logic:
    //numberOfBedrooms is 1
    //print: “One Bedroom Selected”
    //set startingPrice as 1100
    //numberOfBedrooms is 2
    //print: “Two Bedroom Selected”
    //set startingPrice as 1850
    //numberOfBedrooms is 3
    //print: “Three Bedroom Selected”
    //set startingPrice as 2550
    //All other inputs:
    //Print “No such Bedrooms available”
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to pick a house
        System.out.println("Select between a 1 to 3 bedroom house");
        //get users input for the number of bedrooms
        int numberOfBedrooms = input.nextInt();
        if(numberOfBedrooms == 1){
            System.out.println("One Bedroom");
            System.out.println("Starting price is $1100");
        }
        else if(numberOfBedrooms == 2){
            System.out.println("Two Bedrooms");
            System.out.println("Starting price is $1850");
        }
        else if(numberOfBedrooms == 3){
            System.out.println("Three bedrooms");
            System.out.println("Starting price $2550");
        }
        else {
            System.out.println("Invalid Choice");
        }

    }
}
