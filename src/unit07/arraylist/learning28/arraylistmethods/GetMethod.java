package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;
//method to get the index location of things in an array list
public class GetMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bye", "Why"));
        System.out.println(words);
        //gets the second index in the array
        System.out.println(words.get(2));
        //find the index using a search word
        System.out.println(words.indexOf("Why"));
    }
}
