package unit08.twod.arrays.learning31;

import java.util.Arrays;

//making a 2D array with different sized arrays

public class DifferentSizeArrays {
    public static void main(String[] args) {
        //create a 2D array with 3 rows and undefined column lengths
        int[][] numbers = new int[3][];
        System.out.println(Arrays.deepToString(numbers));
        //create a new array
        int[] numbers0 = {2, 3, 4, 5, 6, 7};
        //assign the numbers0 array to the first row of the numbers 2D array
        numbers[0] = numbers0;
        System.out.println(Arrays.deepToString(numbers));
        //create new 1D arrays named numbers1 and numbers2
        int[] numbers1 = {8, 534, 1};
        int[] numbers2 = {645, 234};
        //assign values to the second and third rows of the 2D array
        numbers[1] = numbers1;
        numbers[2] = numbers2;
        System.out.println(Arrays.deepToString(numbers));
    }
}
