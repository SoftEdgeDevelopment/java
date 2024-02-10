package unit11.collections.learning42.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIntegerString {

    //method to sort elements from a List
    public static void main(String[] args) {
        //new List for integer using ArrayList List.of
        List<Integer> numbers = new ArrayList<>(List.of(4234, 645, 756, 2, 432, 36, 45634, 5645, 6876, 987, 65, 34));
        System.out.println("unsorted: " + numbers);
        //using Collections to sort the numbers from smallest to largest
        Collections.sort(numbers);
        System.out.println("sorted: " + numbers);
        //another way to sort everything in natural order using Comparator (must be a comparable object)
        numbers.sort(Comparator.naturalOrder());
        System.out.println("least to greatest" + numbers);
        //will sort everything in reverse order
        numbers.sort(Comparator.reverseOrder());
        System.out.println("greatest to least" + numbers);

        //new List for String using ArrayList List.of
        List<String> words = new ArrayList<>(List.of("hello", "together", "apple", "pasta"));
        System.out.println("unsorted: " + words);
        //using Collections to sort the words in alphabetical order
        Collections.sort(words);
        System.out.println("sorted in alphabetical order : " + words);
    }
}
