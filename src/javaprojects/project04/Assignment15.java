package javaprojects.project04;

import java.util.Scanner;

//gets user input for grade and display if pass or fail
public class Assignment15 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter grade
        System.out.println("Enter your grade % as a whole number");
        //new int to store user input as grade
        int grade = input.nextInt();
        //if grade greater than 90
        if (grade > 90){
            System.out.println("excellent");
        }
        //else if grade greater than 70 and less than 90
        else if(grade > 70 && grade < 90){
            System.out.println("good");
        }
        //else if grader greater than 60 and less than 70
        else if(grade > 60 && grade < 70){
            System.out.println("pass");
        }
        //else grade is 60 or less
        else{
            System.out.println("fail");
        }
    }
}
