package unit03.conditionals.day13;

import java.util.Scanner;
//prompt user for grade and use if, else if, else statement to see if they are passing
public class GradingBlock {
    public static void main(String[] args) {
        //        A >89
        //        B >79 less than 90
        //        C > 69 less than 80
        //        F anything less than 69
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for grade
        //get user input as int variable for grade
        int grade = 43;
        //if grade is greater than 89
        if(grade > 89){
            //grade is an A
            System.out.println("Your grade is A");
        }
        //else if grade is greater than 79 but less than 89
        else if(grade>79){
            //grade is a B
            System.out.println("Your grade is B");
        }
        //else if grade is greater than 69 but less than 79
        else if (grade > 69) {
            //grade is a C
            System.out.println("Your grade is C");
        }
        //else grade is less than or equal to 69
        else {
            //grade is an F
            System.out.println("Your grade is F.");
        }

    }
}
