package javaprojects.project05;

import java.util.Scanner;

//write a program that will print out a new word which is merged by the inputs entered by user.
//if either of the entered inputs does not have exactly 3 characters, print “cannot merge”
//merge their characters one by one and print together
public class Assignment04 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter x2 three letter words
        System.out.println("Enter x2 three letter words");
        //get user inputs for word1 and word2
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        //if the length of either word1 or word2 is greater than 3, cannot merge
        if (word1.length() > 3 || word2.length() > 3){
            System.out.println("Output : cannot merge");
        }
        //else merge the two words and display the result
        else {
            System.out.println("Output : " + word1 + word2);
        }
    }
}
