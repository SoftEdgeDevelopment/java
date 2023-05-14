package javaprojects.project04;

import java.util.Scanner;
//switch and cases for user input yes, no, or help
public class Assignment20 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new char variables created for no, yes, help
        char n = 'n';
        char y = 'y';
        char h = 'h';
        //new String to store user input
        String userInput = input.nextLine();
        //new switch and cases for user input
        switch (userInput){
            case "n":
                System.out.println("thank you anyway for your consideration");
                break;
            case "y":
                System.out.println("your request is being processed”");
                break;
            case "h":
                System.out.println("sorry, no help is currently available");
        }
    }
}
