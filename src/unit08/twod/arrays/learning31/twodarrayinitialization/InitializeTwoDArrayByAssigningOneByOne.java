package unit08.twod.arrays.learning31.twodarrayinitialization;

import java.util.Arrays;

//initializing 2d array by adding elements 1 by 1

public class InitializeTwoDArrayByAssigningOneByOne {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        //3 array elements with 2 indexes in each array
        int[] nums0 = {2,3};
        int[] nums1 = {2,3};
        int[] nums2 = {2,3};

        //deepToString() to display 2d array
        System.out.println(Arrays.deepToString(numbers));
        //assign each index of the 2d array to an array
        numbers[0] = nums0;
        System.out.println(Arrays.deepToString(numbers));
        numbers[1] = nums1;
        numbers[2] = nums2;
        System.out.println(Arrays.deepToString(numbers));

    }
}
