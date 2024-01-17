package unit11.collections.learning42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStringList {

    //different ways for sorting List<String>
    public static void main(String[] args) {
        //new List using String and ArrayList for a list of words
        List<String> stringList = new ArrayList<>(List.of("hey","hi","hello","how are you","okay","yes","no","fine","congratulations"));

        //display insertion order (original)
        System.out.println("Insertion order: " + stringList);

        //display stringList using natural order (alphabetical)
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Reverse Order: " + stringList);

        //display stringList using reverseOrder (alphabetical)
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Natural Order: " + stringList);
    }
}
