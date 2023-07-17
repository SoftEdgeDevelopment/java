package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;
//array list as method using collection to display list of numbers
public class CreateWithArraysMethod {
    public static void main(String[] args) {
        //new array list using Arrays.asList to get a collection of numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //display the numbers from the array list
        System.out.println(numbers);
    }
}
