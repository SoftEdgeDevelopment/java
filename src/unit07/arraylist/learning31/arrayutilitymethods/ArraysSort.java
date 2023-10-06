package unit07.arraylist.learning31.arrayutilitymethods;

import java.util.Arrays;

//method to sort arrays

public class ArraysSort {
    public static void main(String[] args) {
        int[] numbers = {-34, 23, 45, 3245, 234, 52, -3242523, -234235, 2341};
        System.out.println("before sorting: ");
        //Arrays.toString() to display
        System.out.println(Arrays.toString(numbers));
        //Arrays.sort() to sort in order
        Arrays.sort(numbers);
        System.out.println("after sorting: ");
        System.out.println(Arrays.toString(numbers));

        String[] words = {"awd", "gese","kjiyuk","adrg", "abb", "hjihjt"};
        System.out.println("before sorting: ");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("after sorting: ");
        System.out.println(Arrays.toString(words));
    }

}
