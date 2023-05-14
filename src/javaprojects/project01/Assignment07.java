package javaprojects.project01;

import java.util.Scanner;

public class Assignment07 {
    //Two variables, num and cost have been declared and given values
    //num is an integer and cost is a double
    //write a statement that prints num and cost
    //print both values (num first, then cost), separated by a space on a single line
    //do not output anything else
    public static void main(String[] args) {
        //create a new scanner for user input
        Scanner input = new Scanner(System.in);
        //get user input for number as a whole number
        int num = input.nextInt();
        //get user input for cost as a whole or decimal number
        double cost = input.nextDouble();
        System.out.println(num + " " + cost);
    }
}
