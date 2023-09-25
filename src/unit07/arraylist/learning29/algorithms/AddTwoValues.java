package unit07.arraylist.learning29.algorithms;


import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoValues {
    public static void main(String[] args) {
        //sum of two array lists stored into a third array list
        //create 2 array lists with assigned numbers aslist with the same index amount
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(14,28,56,102));
        //create a sum array list empty to store the total
        ArrayList<Integer> sumList = new ArrayList<>();
        //for the array list size
        for (int i = 0; i < nums1.size(); i++) {
            //create a new int to store adding each element in array 1 and 2
            int sumValue = nums1.get(i) + nums2.get(i);
            //add the sum element to the sum array list
            sumList.add(sumValue);
        }
        //display each array list
        System.out.println("num1 list: "+nums1);
        System.out.println("num2 list: "+nums2);
        //display the sum
        System.out.println("sum of nums: "+sumList);

    }
}
