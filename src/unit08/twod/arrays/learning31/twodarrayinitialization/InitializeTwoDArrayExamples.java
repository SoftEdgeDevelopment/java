package unit08.twod.arrays.learning31.twodarrayinitialization;

import java.util.Arrays;

//example to initialize 2d String array

public class InitializeTwoDArrayExamples {
    public static void main(String[] args) {
        //2d array for words elements
        String[][] words = new String[2][2];
        //2 arrays for words indexes
        String[] words1 = {"Cat","Hat"};
        String[] words2 = {"Dog","Fog"};
        System.out.println(Arrays.deepToString(words));
        //assign the first index value of words to words1
        words[0] = words1;
        System.out.println(Arrays.deepToString(words));
        words[1] = words2;
        System.out.println(Arrays.deepToString(words));
    }
}
