package javaprojects.project04;

import java.util.Scanner;
//checks user input if they got the correct answer or invalid choice for multiple choice question ABC
public class Assignment09 {
    public static void main(String[] args) {
        //venus
        //pluto
        //neptune
        //create new scanner to store user input
        Scanner input = new Scanner(System.in);
        //prompt the user to answer the test question
        System.out.println("What is the farthest planet in the solar system?");
        System.out.println("A -> Venus");
        System.out.println("B -> Pluto");
        System.out.println("C -> Neptune");
        String answer = input.nextLine();
        if (answer.equals("A") || answer.equals("a") || answer.equals("C") || answer.equals("c")){
            System.out.println(answer + " - incorrect");
        }
        else if (answer.equals("B") || answer.equals("b")){
            System.out.println(answer + " - correct");
        }
        else{
            System.out.println("invalid choice");
        }
    }
}