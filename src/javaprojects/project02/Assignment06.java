package javaprojects.project02;

import java.util.Scanner;

public class Assignment06 {
    //make a program to convert temperature in Celcius (taken from user input) to temperature in Fahrenheit
    //use a scanned and ask user to enter temp in C
    //declare 2 double variables, celcius, convertToF
    public static void main(String[] args) {
        //prompt user
        System.out.println("Enter the temperature in Celcius");
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //create celcius variable for user input
        double celcius = input.nextDouble();
        //convert user input celcius to fahrenheit
        double convertToF = (celcius * 1.8) + 32;
        //display user input using variables
        System.out.println("Temperature in Fahrenheit: " + convertToF + " degrees");

    }
}
