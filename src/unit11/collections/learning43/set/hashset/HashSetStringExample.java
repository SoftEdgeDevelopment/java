package unit11.collections.learning43.set.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetStringExample {
    //hashset example with Strings, add, remove, contains
    public static void main(String[] args) {
        //new HashSet for String
        Set<String> stringHashSet = new HashSet<>();
        //add words to the set
        stringHashSet.add("hello");
        System.out.println(stringHashSet);

        stringHashSet.add("hi");
        System.out.println(stringHashSet);

        stringHashSet.add("yes");
        System.out.println(stringHashSet);

        //checks if the set contains the specific String
        System.out.println("does it already contain? "+ stringHashSet.contains("hi"));
        System.out.println("does it already contain? "+ stringHashSet.contains("bye"));
        System.out.println(stringHashSet);

        //will display true or false if String can be added to the set
        System.out.println("can new word be added?" + stringHashSet.add("hi"));
        System.out.println("can new word be added?" + stringHashSet.add("bye"));
        System.out.println(stringHashSet);

        //new HashSet List.of to add in multiple Strings
        Set<String> newStringHashSet = new HashSet<>(List.of("A","B","C","D","E","F","G"));
        System.out.println(newStringHashSet);
        //checks if the Strings are contained in the set
        System.out.println(newStringHashSet.contains("Z"));
        System.out.println(newStringHashSet.contains("A"));
        //remove Strings from the set
        newStringHashSet.remove("A");
        newStringHashSet.remove("B");
        newStringHashSet.remove("C");
        System.out.println(newStringHashSet);
    }
}
