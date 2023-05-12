package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//while loop to write the sum of the digits of a given number
public class Practice13 {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter a number
        System.out.println("Enter a number");
        //new variable to get users input as a number
        int userInput = input.nextInt();   //test with number 234
        //new int for the total starting at 0 to get the total value of all the digits
        int total = 0;
        while (userInput != 0) {
            //do math to separate all the digits from eachother
            //mod by 10 to get the 1s digit as a remainder
            int digit = userInput % 10;   //234 - example number
            //add the ones digit to the total
            total += digit;   //4
            //will show the total of each digit starting with the ones digit
            System.out.print(total + ", ");
            //to get the 10s digit, divide by 10 because ints will always give whole number
            userInput = userInput / 10;   //23
        }
        System.out.println(": The sum of the digits in the number is " + total);
    }

}
