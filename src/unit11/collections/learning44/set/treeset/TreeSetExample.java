package unit11.collections.learning44.set.treeset;

import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    //example using TreeSet, add, remove, poll, contains, ceiling, higher, floor, lower, subset, tailset, headset
    public static void main(String[] args) {
        //new TreeSet using integer List of numbers
        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(14,235,634,12,745,41,457,68));
        System.out.println(integerTreeSet);
        System.out.println("_".repeat(15));
        //checks if numbers can be added to the set
        System.out.println("add 20 to the set? " + integerTreeSet.add(20));
        System.out.println("add 41 to the set? " + integerTreeSet.add(41));
        System.out.println(integerTreeSet);
        System.out.println("_".repeat(15));
        //checks if numbers can be removed from the set
        System.out.println("remove 123 from the set? " + integerTreeSet.remove(123));
        System.out.println("remove 14 from the set? " + integerTreeSet.remove(14));
        System.out.println("remove 12 from the set? " + integerTreeSet.remove(12));
        System.out.println(integerTreeSet);
        System.out.println("_".repeat(15));
        //poll the first number from the set
        System.out.println("poll first: " + integerTreeSet.pollFirst());
        //poll the last number from the set
        System.out.println("poll last: " + integerTreeSet.pollLast());
        System.out.println("_".repeat(15));
        System.out.println(integerTreeSet);
        //checks if the number is contained
        System.out.println("contains 68? " + integerTreeSet.contains(68));
        System.out.println("_".repeat(15));
        System.out.println(integerTreeSet);
        //gets the next number in order larger than the ceiling search number
        System.out.println("ceiling of 200: " +integerTreeSet.ceiling(200));
        //will get the next number in order which is higher from the search number
        System.out.println("higher of 250: " + integerTreeSet.higher(250));
        //will get the number next in order smaller than the search
        System.out.println("floor of 650: " + integerTreeSet.floor(650));
        //will get the number next in order lower than the search
        System.out.println("lower 68: " + integerTreeSet.lower(68));
        //to display all the numbers between 2 search values
        System.out.println("subset between 50-500: " + integerTreeSet.subSet(50,500));
        System.out.println("subset between 50-500 (using overloaded subset): " + integerTreeSet.subSet(50,true, 500, true));
        //displays everything after
        System.out.println("tailset starting from 41: " + integerTreeSet.tailSet(41));
        System.out.println("tailset starting from 41 (using overloaded tailset): " + integerTreeSet.tailSet(41,false));
        //will display everything until the headset (not included unless overloaded as inclusive)
        System.out.println("headset until 457: " + integerTreeSet.headSet(457));
        System.out.println("headset until 457 (using overloaded headset): " + integerTreeSet.headSet(457,true));

    }
}
