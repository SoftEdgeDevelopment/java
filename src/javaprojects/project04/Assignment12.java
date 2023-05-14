package javaprojects.project04;

import java.util.Scanner;
//gets user input and checks if a number is positive or negative
public class Assignment12 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to display the input
        System.out.print("In : ");
        //create new variable to store user input
        int userInput = input.nextInt();
        if (userInput > 0){
            System.out.println(userInput + " : positive");
        }
        else if(userInput < 0){
            System.out.println(userInput + " : negative");
        }
        else{
            System.out.println(userInput + " : zero");
        }
    }
}
