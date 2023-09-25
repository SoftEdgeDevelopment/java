package unit07.arraylist.learning29.traversingarraylist;

import java.util.ArrayList;
import java.util.Arrays;
//example of cannot add or remove from foreach array list
public class ForEachNoAddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 24, 50, 100, 103, 135, 167, 189));
        System.out.println(numbers);
        //for each number in the array list
        for (int num : numbers) {

            //this will not work during a foreach loop, will give an error
            //numbers.add(10);
            //numbers.remove(2);
            //display the number
            System.out.print(num + " ");
        }
    }
}
