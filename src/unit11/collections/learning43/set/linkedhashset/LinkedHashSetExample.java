package unit11.collections.learning43.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
    //example using LinkedHashSet, add, remove, contains
    public static void main(String[] args) {
        //new LinkedHashSet using integer
        Set<Integer> linkedHashIntegerSet = new LinkedHashSet<>(List.of(12, 41, 53, 63, 85, 25, 47, 95, 54, 75, 42, 5));
        System.out.println(linkedHashIntegerSet);
        //add to the set
        linkedHashIntegerSet.add(23);
        linkedHashIntegerSet.add(1);
        linkedHashIntegerSet.add(-98);
        System.out.println("-".repeat(15));
        //display the set
        System.out.println(linkedHashIntegerSet);
        //remove from the set
        System.out.println("remove 12? " + linkedHashIntegerSet.remove(12));
        System.out.println("remove 13? " + linkedHashIntegerSet.remove(13));
        System.out.println("remove 85? " + linkedHashIntegerSet.remove(85));
        //check if the set contains
        System.out.println("contains 1? " + linkedHashIntegerSet.contains(1));
        System.out.println(linkedHashIntegerSet);
    }
}
