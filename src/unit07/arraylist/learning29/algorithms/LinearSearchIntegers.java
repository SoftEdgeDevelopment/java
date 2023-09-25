package unit07.arraylist.learning29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//method to get user input for search key and display if it is contained in the array list or not

public class LinearSearchIntegers {
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //new array list aslist with assigned values
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,14,15,19,20,30,44));
        //prompt user to input a key
        System.out.println("Input a key (number): ");
        //store user input for key integer
        int key = input.nextInt();

        //new integer for the index calling to the returnIndex method using numbers array list and user input for key
        int index = returnIndex(numbers, key);
        //if index does not equal -1
        if (index != -1) {
            //display the key and which index it is located
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            //else display the key and that it is not on the list (return -1 because key was not found in the list in the method)
            System.out.println("Key " + key + " not found in the list.");
        }
    }

    public static int returnIndex(ArrayList<Integer> arrList, int key) {
        //go over each number in the array list
        for (int i = 0; i < arrList.size(); i++) {
            //if the number index equals the key
            if (arrList.get(i) == key) {
                return i; // return the index of the first occurrence of the key
            }
        }
        return -1; // return -1 if the key is not found in the list
    }
}

