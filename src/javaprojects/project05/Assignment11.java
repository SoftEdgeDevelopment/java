package javaprojects.project05;

import java.util.Scanner;

public class Assignment11 {
    //write a program that will print out numbers (divisible by 3) from num1 to num2 entered by user
    public static void main(String[] args) {
        //create scanner for user input
        Scanner userInput = new Scanner(System.in);
        //create variables for num1 and num2
        System.out.println("Input num1: ");
        int num1 = userInput.nextInt();
        System.out.println("Input num2: ");
        int num2 = userInput.nextInt();

        // Call the getNumbers method and display the result
        System.out.println("Output : " + getNumbers(num1, num2));

    }
    //create method that will display numbers divisible by 3 from start to end point
    public static String getNumbers(int number1, int number2){
        //new String to store result;
        String result = "";

        //loop through numbers, starting from number1 until number2
        for (int i = number1; i < number2; i++) {
            //check if the number is divisible by 3
            if(i % 3 == 0){
                //add the number if it is divisible by 3 to the String result, separated by a comma
                result += i + ",";
            }
        }
        return result;
    }
}
