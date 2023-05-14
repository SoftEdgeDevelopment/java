package javaprojects.project03;

import java.util.Scanner;

//check if a variable begins with or ends with certain letters and display a message to user
public class Assignment05 {
    //Declare a variable name. You will check if it is a cool name. You should check the
    //variable manually.
    //- If the name begins with an ‘a’ or a ‘z’
    //Print: “Your name is cool”
    //- If the name ends with 'm'
    //Print: "Almost cool"
    //- Otherwise Print: “Sorry not a cool name”
    public static void main(String[] args) {
        //create new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter their name
        System.out.println("Enter your name");
        //get user input for their name
        String name = input.nextLine();
        //checks if the name begins with a or z
        if(name.startsWith("a") || name.startsWith("z")|| name.startsWith("A")|| name.startsWith("Z")){
            //tell them they have a cool name
            System.out.println("Your name is cool");
        }
        //else if it ends with m
        else if(name.endsWith("m")){
            //say they are almost cool
            System.out.println("Almost cool");
        }
        //else they are not cool
        else {
            System.out.println("Sorry not a cool name");
        }
    }

}