package javaprojects.project04;

import java.util.Scanner;
//gets user input and checks if they are teacher or student
public class Assignment14 {

    //get user input for name
    //if name equals "Chen", display teacher
    //else display student
    public static void main(String[] args) {
        //scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter name
        System.out.println("Enter your name");
        //get string for user input
        String name = input.nextLine();
        //if name is chen
        if (name.equals("Chen") || name.equals("chen")){
            //teacher
            System.out.println("teacher");
        }
        //any other name
        else {
            System.out.println("student");
        }
    }
}
