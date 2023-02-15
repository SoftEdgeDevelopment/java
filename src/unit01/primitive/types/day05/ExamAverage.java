package unit01.primitive.types.day05;

import java.util.Scanner;

public class ExamAverage {
    public static void main(String[] args) {
//        Take student name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name);
//        Take the course name
        System.out.println("Enter course name: ");
        String courseName = input.nextLine();
        System.out.println(courseName);
//        Take Exam 1 and Exam 2 result
        System.out.println("Enter first exam's result: ");
        int exam1 = input.nextInt();
        System.out.println(exam1);

        System.out.println("Enter second exam's result: ");
        int exam2 = input.nextInt();
        System.out.println(exam2);
//        Display the average grade along with student name and course name.
        double average;
        average = (exam1 + exam2 )/2;
        System.out.print(name);
        System.out.print(" ");
        System.out.print("has the average from ");
        System.out.println(courseName);
        System.out.println(average);
    }
}
