package unit01.primitive.types.day04;

import java.util.Scanner;

public class NextLineProblem {
    public static void main(String[] args) {
        //get multiple user inputs with nextLine
        //create new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for GPA as a decimal
        System.out.println("What is your Gpa");
        //get user input for GPA
        double gpa = input.nextDouble();
        //display message for user GPA and their input
        System.out.println("Your GPA is ");
        System.out.println(gpa);
        //prompt user for favorite programming language
        System.out.println("What is your favorite PL");
        //new String for user input as text
        String programmingLanguage;
        input.nextLine(); // nextLine buffer to prevent nextline problem
        //get user input for programming language as string without having to make new scanner
        programmingLanguage = input.nextLine();
        //display message with user input string variable
        System.out.println("Your favorite language is");
        System.out.println(programmingLanguage);
    }
}
