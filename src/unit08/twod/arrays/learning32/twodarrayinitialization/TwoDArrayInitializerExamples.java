package unit08.twod.arrays.learning32.twodarrayinitialization;

import java.util.Arrays;

//example to initialize arrays in a 2d array

public class TwoDArrayInitializerExamples {
    public static void main(String[] args) {
        //create 2d array with arrays initialized
        String[][] words ={
                {"apple", "banana"},
                {"kiwi", "strawberry", "melon"},
                {"pear","apple"}
        };
        //print the full 2d array with all the arrays
        System.out.println(Arrays.deepToString(words));
        //print the first array in the 2d array
        System.out.println(Arrays.deepToString(words[0]));
    }
}
