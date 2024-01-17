package unit11.collections.learning42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegerList {

    //different ways for sorting List<Integer>
    public static void main(String[] args) {
        //new List of numbers
        List<Integer> integerList = new ArrayList<>(List.of(23, 45, 56, 75, 42, 85, 24, 534, 71, 23));

        //display the original numbers (insertion order)
        System.out.println("Insertion Order: " + integerList);

        //sort numbers using Comparator.naturalOrder
        integerList.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + integerList);

        //sort numbers using Comparator.reverseOrder
        integerList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + integerList);
    }
}
