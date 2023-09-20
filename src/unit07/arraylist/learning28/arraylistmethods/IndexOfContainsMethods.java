package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;
//different ways to check if array list contains things
public class IndexOfContainsMethods {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bye", "Why"));
        System.out.println(words.indexOf("Why"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);
        //will return -1 if nothing is there
        System.out.println(numbers.indexOf("5"));
        //will return 4 because that is the index location
        System.out.println(numbers.indexOf(5));
        //checks if its contained within the list
        System.out.println(words.contains("Hi"));
        System.out.println(words.contains("Yes"));
        System.out.println(words);
        //clears the array list
        words.clear();
        System.out.println(words.isEmpty());
        //add words to the list
        words.add("Reset");
        words.add("List");
        System.out.println(words);
    }
}
