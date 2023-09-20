package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SizeMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bye", "Yes"));
        //gets the size of the array list
        System.out.println(words.size());
        //gets the last word in the array list
        System.out.println(words.get(words.size()-1));
    }
}
