package unit01.primitive.types.learning05;

import java.util.Scanner;

public class ExamAverage {
    //multiple user input and display with maths example
    public static void main(String[] args) {
//        Take student name
        //new Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for their name
        System.out.println("Enter your name: ");
        //get user input as String variable
        String name = input.nextLine();
        //print user input for name
        System.out.println(name);
//        Take the course name
        //prompt user for course name
        System.out.println("Enter course name: ");
        //new String variable as courseName for user input
        String courseName = input.nextLine();
        //prints user input for courseName
        System.out.println(courseName);
//        Take Exam 1 and Exam 2 result
        //prompt user for exam 1 result
        System.out.println("Enter first exam's result: ");
        //get user input as a whole number
        int exam1 = input.nextInt();
        //display user input as whole number
        System.out.println(exam1);

        //prompt user for exam 2 results
        System.out.println("Enter second exam's result: ");
        //get user inputs for exam2 as whole number
        int exam2 = input.nextInt();
        //display user input
        System.out.println(exam2);
//        Display the average grade along with student name and course name.
        //new double for finding the average
        double average;
        //average = all the scores added, divided by the amount of scores added, ex.(exam1 = 50, exam2 = 45) 95/2 = 47.5 average
        average = (exam1 + exam2 )/2;
        //display users name
        System.out.print(name);
        //practice with spacing
        System.out.print(" ");
        //practice with print, this will all be on one line
        System.out.print("has the average from ");
        //will print new line for courseName
        System.out.println(courseName);
        //will print new line for grade average
        System.out.println(average);
    }
}
