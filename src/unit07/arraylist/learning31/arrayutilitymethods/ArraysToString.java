package unit07.arraylist.learning31.arrayutilitymethods;

import java.util.Arrays;

//method to convert Arrays.toString() to display

public class ArraysToString {
    public static void main(String[] args) {
        //new array for words
        String[] words = {"hi", "bye", "yes", "no"};
        //displaying the words will not work like this
        System.out.println(words);
        //display the words by doing Arrays.toString()
        System.out.println(Arrays.toString(words));
    }

}
