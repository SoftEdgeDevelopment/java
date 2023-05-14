package javaprojects.project04;

import java.util.Scanner;
//create a switch and get user input to display the http status code
public class Assignment18 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter a status code
        System.out.println("Enter status code");
        //new int to store user input
        int userInput = input.nextInt();
        //switch for user input
        switch (userInput){
            //for each case display the status
            case 200:
                System.out.println("Ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
        }
    }
}