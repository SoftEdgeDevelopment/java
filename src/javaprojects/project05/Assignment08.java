package javaprojects.project05;

import java.util.Scanner;
//create a method to get users name and checks if it is contained within a sentence
public class Assignment08 {
    public static void main(String[] args) {
        //prompt user to send email (containing the name of the person)
        System.out.println("Send an email");
        //checks if the users input contains the name using getMyName() method
        if(getMyName().contains("John Doe")){
            //the name is contained in the users message
            System.out.println("Read This Email");
        }
        else {
            //else the name is not contained in the message
            System.out.println("Do Not Read This Email");
        }
    }
    public static String getMyName(){
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new string to store users input
        String userInput = input.nextLine();
        //return users input for name
        return userInput;
    }
}
