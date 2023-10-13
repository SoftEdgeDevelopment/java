package unit07.arraylist.learning31.collectionutilitymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class MaxMinMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23,35,2,35,6,34,64,57,4,57));

        System.out.println(numbers);
        //import Collections to display the max and min number from the array list
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
