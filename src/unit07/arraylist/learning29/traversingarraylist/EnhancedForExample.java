package unit07.arraylist.learning29.traversingarraylist;

import java.util.ArrayList;
import java.util.Arrays;

//foreach loop to display all contents of an array list
public class EnhancedForExample {
    public static void main(String[] args) {
        //new integer array list for numbers as list with assigned numbers 1-9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        //foreach number in the numbers array list
        for (int num : numbers) {
            //print the number
            System.out.println(num);
        }
    }
}
