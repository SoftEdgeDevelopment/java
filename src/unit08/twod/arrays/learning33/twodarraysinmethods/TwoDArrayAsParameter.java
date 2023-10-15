package unit08.twod.arrays.learning33.twodarraysinmethods;

import java.util.Arrays;

//calling to a method to print all elements from arrays in a 2d array

public class TwoDArrayAsParameter {
    public static void main(String[] args) {
        //2d string array with words
        String[][] words ={
                {"apple", "banana"},
                {"kiwi", "strawberry", "melon"},
                {"pear","apple"}
        };
        //call to the printAllElements method to display the elements in the 2d string array
        printAllElements(words);
    }

    //method to print all the elements in the 2d string array
    public static void printAllElements(String[][] arrays) {
        System.out.println(Arrays.deepToString(arrays));
    }
}
