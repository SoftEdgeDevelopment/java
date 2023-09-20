package unit07.arraylist.learning28.arraylistsinmethods;

import java.util.ArrayList;
import java.util.Arrays;
//method to return the last element in an array list
public class ArrayListAsAParameter {
    public static void main(String[] args) {
        //create new array list for numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //call to the method to print the last index in the array list
        printTheLastElement(numbers);

    }
    //make it like any other method for array lists
    //1st type - arraylist
    //2nd type - Integer
    public static void printTheLastElement(ArrayList<Integer> arr){
        //gets the last element in an array list
        System.out.println(arr.get(arr.size()-1));
    }
}
