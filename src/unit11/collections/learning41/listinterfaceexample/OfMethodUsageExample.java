package unit11.collections.learning41.listinterfaceexample;

import java.util.*;

// example demonstrating the usage of List.of method compared to ArrayList
public class OfMethodUsageExample {
    public static void main(String[] args) {
        // Creating a new List interface for items
        List<String> items =
                List.of("Apple", "Banana", "Orange");
        List<String> itemsArrayList =
                new ArrayList<>(items);
        // Trying to add another item to List.of will result in an error
        // items.add("Grapes");

        itemsArrayList.add("Grapes");

        System.out.println(items);
        System.out.println(itemsArrayList);

        // It's common practice to declare as List and create different List implementations
        List<String> stringsArrayList = new ArrayList<>(items);

        List<String> stringsLinkedList = new LinkedList<>(Arrays.asList("Dog", "Cat"));
        // strings = new Stack<>();
        // strings = new Vector<>(items);

        stringsLinkedList.add("Rabbit");
        stringsArrayList.add("Mouse");
        stringsLinkedList.get(1);
        stringsArrayList.get(2);
        stringsArrayList.add("Elephant");
    }
}
