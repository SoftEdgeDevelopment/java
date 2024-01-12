package unit11.collections.learning41.listinterface;

import java.util.*;


//list.of example vs. arraylist
public class OfMethodUsage {
    public static void main(String[] args) {
        //new List interface for words
        List<String> words =
                List.of("Hey","Hi","Hello");
        List<String> wordsArrayList =
                new ArrayList<>(words);
        //will be an error if trying to add another word to list.of
        //words.add("another word");

        wordsArrayList.add("another word");

        System.out.println(words);
        System.out.println(wordsArrayList);



        //common practice to declare as list and create as different list class types
        List<String> stringsArrayList = new ArrayList<>(words);



        List<String> stringsLinkedList = new LinkedList<>(Arrays.asList("hi", "bye"));
        //strings = new Stack<>();
        //strings = new Vector<>(words);

        stringsLinkedList.add("something");
        stringsArrayList.add("something else");
        stringsLinkedList.get(1);
        stringsArrayList.get(2);
        stringsArrayList.add("another");


    }
}
