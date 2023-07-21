package javaprojects.project05;

import java.util.Scanner;
//create a method to get users name and checks if it is contained within a sentence
public class Assignment08 {
    public static void main(String[] args) {
        System.out.println("Send an email");
        //checks if the users input contains the name
        if(getMyName().contains("John Doe")){
            System.out.println("Read This Email");
        }
        else {
            System.out.println("Do Not Read This Email");
        }
    }

    public static String getMyName(){
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new string to store users input
        String userInput = input.nextLine();
        //new String for name
        String name = "John Doe";
        return userInput;
    }
}
