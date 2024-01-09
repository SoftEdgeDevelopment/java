package unit11.collections.learning41.listinterface;

import java.util.ArrayList;
import java.util.List;


//list.of example vs. arraylist
public class OfMethodUsage {
    public static void main(String[] args) {
        //new List for words
        List<String> words =
                List.of("Hey","Hi","Hello");
        List<String> wordsArrayList =
                new ArrayList<>(words);
        //will be an error if trying to add another word to list.of
        //words.add("another word");

        wordsArrayList.add("another word");

        System.out.println(words);
        System.out.println(wordsArrayList);


    }
}
