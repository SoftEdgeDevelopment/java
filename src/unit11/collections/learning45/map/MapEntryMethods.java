package unit11.collections.learning45.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMethods {
    public static void main(String[] args) {
        //new map using string and integer with map of keys and values, for each entry in the String,Integer Map.Entry in the entry set, examples with foreach loops
        Map<String, Integer> integerMap = new HashMap<>(Map.of("A", 12, "T", 46, "I", 12, "D", 7, "Z", 3));
        System.out.println(integerMap);

        //using Map.Entry to get an entry with String and Integer
        Set<Map.Entry<String, Integer>> entrySet = new HashSet<>();
        entrySet = integerMap.entrySet();

        //for each entry in the String,Integer Map.Entry in the entry set
        for (Map.Entry<String, Integer> entry : entrySet) {
            //display each entry 1 by 1
            System.out.println("Entry -> " + entry);
            System.out.println("Key of the entry -> " + entry.getKey());
            System.out.println("Value of the entry -> " + entry.getValue());
        }

        System.out.println("-".repeat(15));
        System.out.println("Print all of the entries greater than 40");
        for (Map.Entry<String, Integer> entries : entrySet) {
            if (entries.getValue() > 40) {
                System.out.println(entries);
            }
        }

        System.out.println("-".repeat(15));
        System.out.println("Print all of the entries with a key either A or Z");
        for (Map.Entry<String, Integer> entries : entrySet) {
            if (entries.getKey() == "A" || entries.getKey() == "Z") {
                System.out.println(entries);
            }
        }

    }

}

