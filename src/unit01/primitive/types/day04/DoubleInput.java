package unit01.primitive.types.day04;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your GPA");
        double gpa;
        gpa = input.nextDouble();
        System.out.println("Congrats you have a great GPA which is");
        System.out.println(gpa);
    }
}
