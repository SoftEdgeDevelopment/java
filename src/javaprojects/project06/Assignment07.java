package javaprojects.project06;

import java.util.Scanner;

//method that loops through every letter of the input and prints out the vowels

public class Assignment07 {

    //method to print vowels from the input string
    public static void getVowels(String input) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.append(ch);
            }
        }
        System.out.println("Output: " + vowels);
    }

    public static void main(String[] args) {
        //declare variables
        String input;
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter the input string: ");
        input = scanner.nextLine();

        //call getVowels method
        getVowels(input);

        //close scanner
        scanner.close();
    }
}
