package javaprojects.project05;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        //write a program that will print out route instructions using switch
        System.out.println("there is a route that is perfectly square, top left corner is A, top right corner is B, bottom right corner is C, bottom left corner is D");
        //create Scanner for user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input A-D: ");
        //gets user input to upper case so the Switch won't fail
        String firstInput = userInput.nextLine().toUpperCase();
        System.out.println("Input A-D: ");
        String secondInput = userInput.nextLine().toUpperCase();

        //call to the getRoute method to display the route taken
        System.out.println("from "+ firstInput + " to "+ secondInput +" your route is: "+getRoute(firstInput,secondInput));

    }


    //new method to generate route instructions
    public static String getRoute(String start, String end) {
        //create String to store the result
        String result = "";

        //display start/end message if start point equals endpoint
        if (start.equals(end)) {
            return "start/end(" + start + ") points are the same";
        }
        //use switch method and if statements for navigation
        switch (start) {
            case "A" :
                if (end.equals("D")) {
                    result = "right > down > left";
                } else if (end.equals("B")) {
                    result = "right";
                } else if (end.equals("C")) {
                    result = "right > down";
                }
                break;
            case "B":
                if (end.equals("A")) {
                    result = "down > left > up";
                } else if (end.equals("C")) {
                    result = "down";
                } else if (end.equals("D")) {
                    result = "down > left";
                }
                break;
            case "C":
                if (end.equals("B")) {
                    result = "left > up > right";
                } else if (end.equals("A")) {
                    result = "left > up";
                } else if (end.equals("D")) {
                    result = "left";
                }
                break;
            case "D":
                if (end.equals("A")) {
                    result = "up";
                } else if (end.equals("B")) {
                    result = "up > right";
                } else if (end.equals("C")) {
                    result = "up > right > down";
                }
                break;
            default:
                return "Invalid input point";
        }

        //append endpoint found message to the result
        result += " : " + end + " found.";

        //return the result string
        return result;
    }
}
