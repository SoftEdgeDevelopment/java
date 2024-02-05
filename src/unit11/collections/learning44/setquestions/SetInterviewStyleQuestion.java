package unit11.collections.learning44.setquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterviewStyleQuestion {
    //set practice question to find and display the distinct words, duplicate words, and unique elements of a given String
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

        //find the words that are duplicates
        //create new Sets to store the distinct and duplicate words
        Set<String> distinctOnes = new HashSet<>();
        Set<String> duplicateOnes = new HashSet<>();

        //for each individual word in the words array
        for (String word : words){
            //if it is not a duplicate, add the word to the distinct list
            if(!distinctOnes.add(word)){
                //add the word to the duplicate list if it is a duplicate
                duplicateOnes.add(word);
            }
        }
        //display the duplicate words
        System.out.println("duplicate words: " + duplicateOnes);
        System.out.println("distinct words: " + distinctOnes);

        //print list of unique elements
        distinctOnes.removeAll(duplicateOnes);
        System.out.println("unique words (no duplicates): " + distinctOnes);



    }
}
