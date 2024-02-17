package javaprojects.project05;

import java.util.Scanner;

public class Assignment16 {
    //method that gets 2 letters from the user input and displays all the letters between them
    public static void main(String[] args) {
        //new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a letter
        System.out.println("Enter first letter: ");
        //get the user input for char at the first index using charAt(0)
        char firstLetter = scanner.next().charAt(0);

        System.out.println("Enter second letter: ");
        char secondLetter = scanner.next().charAt(0);

        System.out.println("Output:");
        //call to getLetters method to display the output
        getLetters(firstLetter, secondLetter);

        scanner.close();
    }

    //method to display the output using char start / char end
    public static void getLetters(char start, char end) {
        //if the start is greater than the end
        if (start > end) {
            //go through each of the letters
            for (char i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
            //else end is greater than start
        } else {
            //go through each of the letters backwards
            for (char i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
