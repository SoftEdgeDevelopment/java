package unit07.arraylist.learning31.arrayutilitymethods;

import java.util.Arrays;

//way to search for the index location of the search key

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {-34, 23, 45, 3245, 234, 52, -3242523, -234235, 2341};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //way to search for the index location of the search key
        System.out.println(Arrays.binarySearch(numbers,45));
        //returning negative number means it cannot be found
        System.out.println(Arrays.binarySearch(numbers,9898));
    }
}
