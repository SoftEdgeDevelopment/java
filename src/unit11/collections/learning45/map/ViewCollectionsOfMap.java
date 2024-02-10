package unit11.collections.learning45.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ViewCollectionsOfMap {
    public static void main(String[] args) {
        //using map and set to view the set of keys and values contained in a map
        Map<String, Integer> integerMap = new HashMap<>(Map.of("A", 12,"T",46,"I",12,"D",7,"Z",3));
        System.out.println(integerMap);

        System.out.println("-".repeat(15));
        //using keySet to display the set of the keys in the map
        System.out.println("Set of the keys -> " + integerMap.keySet());
        Set<String> stringSet = new HashSet<>();
        //assign the set to the map
        stringSet = integerMap.keySet();
        //this will also display the key set
        System.out.println("Set of the keys -> " + stringSet);

        //to display the numbers using values
        System.out.println("Collection of values -> " + integerMap.values());

        //to display the set of entries
        System.out.println("Set of entries -> " + integerMap.entrySet());
    }
}
