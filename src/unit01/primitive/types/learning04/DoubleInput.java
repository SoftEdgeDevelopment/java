package unit01.primitive.types.learning04;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        //get user input and display message with users value
        //create new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for GPA
        System.out.println("What is your GPA");
        //new double variable for gpa because it will be a decimal number
        double gpa;
        //get user input for GPA
        gpa = input.nextDouble();
        //display message with user inputs value for GPA
        System.out.println("Congrats you have a great GPA which is");
        System.out.println(gpa);
    }
}
