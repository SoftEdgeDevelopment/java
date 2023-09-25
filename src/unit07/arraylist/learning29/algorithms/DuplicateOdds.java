package unit07.arraylist.learning29.algorithms;


import java.util.ArrayList;
import java.util.Arrays;

//method to check odd numbers and store in the array list as duplicates

public class DuplicateOdds {
    public static void main(String[] args) {
        // create a new integer ArrayList with assigned numbers aslist
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6, 8, 10, 11, 12, 13));
        // display the original ArrayList
        System.out.println("Original numbers: " + numbers);

        // create a new ArrayList to store odd elements
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Iterate over the original ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            //new integer for going over the current number
            int currentNumber = numbers.get(i);
            //add the number to the oddNumbers array list
            oddNumbers.add(currentNumber);

            // Check if the current number is odd
            if (currentNumber % 2 != 0) {
                // If it's odd, add it again to duplicate it
                oddNumbers.add(currentNumber);
            }
        }

        // Replace the original ArrayList with the modified ArrayList
        numbers = oddNumbers;

        System.out.println("Numbers after duplicating odds: " + numbers);
    }
}

