package javaprojects.project01;

import java.util.Scanner;

public class Assignment14 {

    //declare variables - hour, min, sec, that all hold int values
    //declare amOrPm variable that can hold a String ("AM" or "PM")
    //user will set the different value to the variables
    //print the time to console, display the time in hours:mins:secs amOrPm
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for time in hours
        System.out.println("Input the time in hours");
        //get user input for time in hours
        int hour = input.nextInt();
        //prompt user for time in minutes
        System.out.println("Input the time in minutes");
        //get user input for time in minutes
        int min = input.nextInt();
        //prompt user for time in seconds
        System.out.println("Input the time in seconds");
        //get user input for time in seconds
        int sec = input.nextInt();
        //prompt user for AM or PM time
        System.out.println("is the time in \"AM\" or \"PM\"?");
        //get user input for time if its "AM" or "PM"
        String amOrPm = input.next();
        //display the time in hours:mins:secs amOrPm
        System.out.println("The time is - " + hour + ":" + min + ":" + sec + "" + amOrPm);
    }
}
