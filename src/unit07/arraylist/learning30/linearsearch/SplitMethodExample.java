package unit07.arraylist.learning30.linearsearch;

import java.util.Arrays;

//methods to split string into an array

public class SplitMethodExample {
    public static void main(String[] args) {

        String sentence = "SDET stands for Software Development Engineer in Testing";
        //new string array for words calling to sentence.split will split the string based on the regress - (every space)
        String[] words = sentence.split(" ");
        //this will not work to display the array list
        System.out.println(words);
        //must do Arrays.toString
        System.out.println(Arrays.toString(words));

        //another way of writing each word in a for loop
        for (String word : words) {
            System.out.println(word);
        }

        //way to display the amount of words in a string
        String anotherSentence = "Testing and development goes hand by hand";
        String[] newWords = anotherSentence.split(" ");
        System.out.println("the length of the array is: " + newWords.length);
    }

}
