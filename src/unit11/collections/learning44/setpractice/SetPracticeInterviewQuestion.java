package unit11.collections.learning44.setpractice;

import java.util.*;

public class SetPracticeInterviewQuestion {
    //set practice question to find and display the distinct words of a given String
    public static void main(String[] args) {
        //new string for a sentence
        //find the words that repeat itself
        //give the distinct words
        String str = "this is a nice day in a nice way on a good day";

        //create a String array to split each word
        String[] words = str.split(" ");

        //display the words .toString
        System.out.println("words after being split: " + Arrays.toString(words));

        //give the distinct words
        //create a new Set using String using the words array(set will give distinct)
        Set<String> distinctWordsSet = new HashSet<>(Arrays.asList(words));
        System.out.println("distinct words (HashSet): " + distinctWordsSet);
        //use TreeSet to have it in order
        Set<String> duplicatesWordList = new TreeSet<>(Arrays.asList(words));
        System.out.println("distinct words in order alphabetical order (TreeSet): " + duplicatesWordList);
    }
}
