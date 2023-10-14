package unit08.twod.arrays.learning32.traversingtwodarray;

import java.util.Arrays;

public class ForLoopTraversal {
    public static void main(String[] args) {
        //new 2d String array with assigned words
        String[][] words = {{"hi", "bye"}, {"yes", "maybe", "no"}, {"one", "two", "three"}};

        //for each array in the 2d array
        //for (String[] word : words) {
        // print out each word using Arrays.toString()
        //    System.out.println(Arrays.toString(word));
        //}

        //method to write all contents of a 2d string array in orders with foreach loop
        for (String[] wordArray : words) {
            for (String word : wordArray) {
                System.out.println(word);
            }

        }

    }
}
