package unit07.arraylist.learning29.traversingarraylist;

import java.util.ArrayList;
import java.util.Arrays;

//different methods to remove elements from an array list
public class RemovingProblem {
    public static void main(String[] args) {
        // create a new integer array list aslist with assigned numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 46, 79, 98, 100, 102, 140, 155, 160, 170));
        //display all numbers before removing
        System.out.println("all numbers: " + numbers);

        // create a new ArrayList to store numbers greater than or equal to 100
        ArrayList<Integer> numbersGreaterThan100 = new ArrayList<>();

        // for each number in the array list
        for (int i = 0; i < numbers.size(); i++) {
            //if the number is greater than 100
            if (numbers.get(i) > 100) {
                //add it the numbersGreaterThan100 array list
                numbersGreaterThan100.add(numbers.get(i));
            }
        }

        //different method that does the same thing without creating a new array list to store the numbers
        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 100) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("different method numbers greater than 100: " + numbers);
        System.out.println("all numbers greater than 100: " + numbersGreaterThan100);
        //repeats the displayed text for count number of times
        System.out.println("-".repeat(30));
        //add more numbers to the array list
        numbers.add(12);
        numbers.add(78);
        numbers.add(113);
        System.out.println("updated numbers after adding more: "+numbers);
        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 100) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("updated greater than 100 numbers after adding more: "+ numbers);
    }
}
