package unit07.arraylist.learning30.splitjoinmethods;

import java.util.Arrays;

//method to split a string and convert the first letter of each word to upper case

public class SplitPractice {
    public static void main(String[] args) {
        String sentence = "Today I went to the store and bought an apple";
        //sentence split
        String[] words = sentence.split(" ");
        //for each word in the words array list
        for (String word : words) {
            //use substring to get the index of the first letter and change to upper case
            // +
            // the word of the substring starting from the first index
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
        }
    }


}
