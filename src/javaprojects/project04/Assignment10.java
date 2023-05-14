package javaprojects.project04;

import java.util.Scanner;
//get user input and check if, else if, else they are eligible for school and what grade they are in
public class Assignment10 {
    public static void main(String[] args) {
        //new scanner to get user input for age
        Scanner input = new Scanner(System.in);
        //prompt user to enter age
        System.out.println("Enter age");
        //new int variable
        int age = input.nextInt();
        //checks ages and assigns grade level
        if (age < 2) {
            System.out.println("ineligible");
        } else if (age == 2) {
            System.out.println("toddler");
        } else if (age >= 3 && age <= 5) {
            System.out.println("early childhood");
        } else if (age >= 6 && age <= 7) {
            System.out.println("young reader");
        } else if (age >= 8 && age <= 10) {
            System.out.println("elementary");
        } else if (age >= 11 && age <= 12) {
            System.out.println("middle");
        } else if (age == 13) {
            System.out.println("impossible");
        } else if (age >= 14 && age <= 16) {
            System.out.println("high school");
        } else if (age >= 17 && age <= 18) {
            System.out.println("scholar");
        } else if (age > 18) {
            System.out.println("ineligible");
        }
    }
}
