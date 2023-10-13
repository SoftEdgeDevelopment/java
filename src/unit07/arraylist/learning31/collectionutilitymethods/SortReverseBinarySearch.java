package unit07.arraylist.learning31.collectionutilitymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//different Collections methods

public class SortReverseBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23, 35, 2, 35, 6, 34, 64, 57, 4, 57));
        System.out.println("original list: "+numbers);
        //import from Collections to sort the numbers
        Collections.sort(numbers);
        System.out.println("sorted list: "+numbers);
        //import from Collections to reverse the numbers
        Collections.reverse(numbers);
        System.out.println("reversed list"+numbers);
        Collections.reverse(numbers);
        System.out.println("reversed again for binary search: "+numbers);
        System.out.println("index of search key is: "+Collections.binarySearch(numbers,6));
    }
}
