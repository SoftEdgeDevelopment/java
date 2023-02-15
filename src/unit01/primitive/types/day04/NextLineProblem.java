package unit01.primitive.types.day04;

import java.util.Scanner;

public class NextLineProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Gpa");
        double gpa = input.nextDouble();
        System.out.println("Your GPA is ");
        System.out.println(gpa);
        System.out.println("What is your favorite PL");
        String programmingLanguage;
        input.nextLine(); // nextLine buffer to prevent nextline problem
        programmingLanguage = input.nextLine();
        System.out.println("Your favorite language is");
        System.out.println(programmingLanguage);
    }
}
