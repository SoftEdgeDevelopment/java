package unit11.collections.learning45.map;

import java.util.HashMap;
import java.util.Map;

public class MapExampleAndMethods {
    //practice with map and hashmap, unique no duplicates, key, value, put, putIfAbsent,
    public static void main(String[] args) {
        //new hashmap using map with String for key and Integer for value
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        //new hashmap using map with assigned keys and values
        Map<String, Integer> integerMap = new HashMap<>(Map.of("A", 12, "T", 3, "X", 16, "P", 39));
        //when it runs, it throws and exception if you try to add duplicate key entry
        System.out.println(integerMap);
        System.out.println("-".repeat(15));

        //adding new key and value to the map
        //if put returns null, that means it was not already in the map so the value will be added
        System.out.println("Put <B , 14> : return -> " + integerMap.put("B", 14));

        //if you put an existing key, the value will be overwritten, the old value will be returned when put
        System.out.println("Put <A , 6> : return -> " + integerMap.put("A", 6));

        System.out.println("-".repeat(15));
        //will only put if the key is absent from the map, will not update if the key is there
        System.out.println("PutIfAbsent <K , 41> : return -> " + integerMap.putIfAbsent("K",41));
        //K will still be 41 because it is not absent
        System.out.println("PutIfAbsent <K , 111> : return -> " + integerMap.putIfAbsent("K",111));

        System.out.println("-".repeat(15));
        //get takes the search key and returns the value of it
        System.out.println("Get <T> : return -> " + integerMap.get("T"));


        System.out.println("-".repeat(15));
        System.out.println(integerMap);
    }
}
