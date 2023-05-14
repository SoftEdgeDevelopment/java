package javaprojects.project01;

import java.util.Scanner;

public class Assignment11 {
    //Create 2 string variables and assign values with user input
    //lan1 = "Java"    and    lan2 = "SQL"
    //using those variables print the exact message below:
    //I will learn "Java" and "SQL" at TechnoStudy
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for lan1
        System.out.println("Enter Programming \"language 1\"");
        //get user input for lan1
        String lan1 = input.nextLine();
        //prompt user for lan2
        System.out.println("Enter Programming \"language 2\"");
        //get user input for lan2
        String lan2 = input.nextLine();
        //display message
        System.out.println("I will learn " + "\"" + lan1 + "\"" + " and " + "\"" + lan2 + "\"" + " at TechnoStudy");
    }
}
