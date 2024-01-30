package unit11.collections.learning43.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetIntegersExample {
    public static void main(String[] args) {
        //create a new HashSet for integers
        Set<Integer> integerSet = new HashSet<>();
        //add numbers to the set
        integerSet.add(7);
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        integerSet.add(9);
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        integerSet.add(11);
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        integerSet.add(15);
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        //will return false because 15 is already in, cannot contain ANY duplicates
        System.out.println("can 15 be added? " + integerSet.add(15));
        //checks if the set contains
        System.out.println("does it contain 10? " + integerSet.contains(10));
        System.out.println("does it contain 11? " + integerSet.contains(11));
        System.out.println("does it contain 33? " + integerSet.contains(33));
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        System.out.println("can 22 be added?" + integerSet.add(22));
        System.out.println(integerSet);
        System.out.println("-".repeat(15));
        //remove from the set
        integerSet.remove(7);
        integerSet.remove(9);
        System.out.println(integerSet);


    }
}
