package unit11.collections.learning45.map;

import java.util.HashMap;
import java.util.Map;

public class MapExampleAndMethods {
    //practice with map and hashmap, unique no duplicates, key, value, put, putIfAbsent, get, getOrDefault, containsKey, containsValue, remove, replace
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
        System.out.println(integerMap);

        System.out.println("-".repeat(15));
        //will only put if the key is absent from the map, will not update if the key is there
        System.out.println("PutIfAbsent <K , 41> : return -> " + integerMap.putIfAbsent("K",41));
        //K will still be 41 because it is not absent
        System.out.println("PutIfAbsent <K , 111> : return -> " + integerMap.putIfAbsent("K",111));

        System.out.println("-".repeat(15));
        //get takes the search key and returns the value of it
        System.out.println("Get <T> : return -> " + integerMap.get("T"));

        System.out.println("-".repeat(15));
        //getOrDefault takes the search key and returns the value of it, or if not in there assigns the default value
        System.out.println("GetOrDefault <X> : return -> " + integerMap.getOrDefault("X", -99));
        System.out.println("GetOrDefault <J> : return -> " + integerMap.getOrDefault("J", -99));

        System.out.println("-".repeat(15));
        //containsKey checks if the key is contained in the map
        System.out.println("Contains Key <I> : return -> " + integerMap.containsKey("I"));
        System.out.println("Contains Key <P> : return -> " + integerMap.containsKey("P"));

        System.out.println("-".repeat(15));
        //containsValue checks if the key is contained in the map
        System.out.println("Contains Value <3> : return -> " + integerMap.containsValue(3));
        System.out.println("Contains Value <5> : return -> " + integerMap.containsValue(5));

        System.out.println("-".repeat(15));
        //remove will return the value and remove it from the map
        System.out.println("Remove <P> : return -> " + integerMap.remove("P"));
        //if it is not contained in the map, will return null because nothing was removed
        System.out.println("Remove <P> : return -> " + integerMap.remove("P"));
        System.out.println("-".repeat(15));
        System.out.println(integerMap);

        System.out.println("-".repeat(15));
        //using remove targeting the key and value - will return true/false
        System.out.println("Remove <A , 6> : return -> " + integerMap.remove("A", 6));
        System.out.println("Remove <B , 45> : return -> " + integerMap.remove("B", 45));
        System.out.println("-".repeat(15));
        System.out.println(integerMap);

        System.out.println("-".repeat(15));
        //using replace to replace a value of a key - returns the original value
        System.out.println("Replace <X , 99> : return -> " + integerMap.replace("X", 99));
        //if key is not contained, there is nothing to replace, it will return null
        System.out.println("Replace <S , 50> : return -> " + integerMap.replace("S", 50));
        //using replace to replace a value of a key using old value with the new value - returns true or false
        System.out.println("Replace <X , 45> : return -> " + integerMap.replace("X", 99, 45));
        //will return false because the value cannot be found
        System.out.println("Replace <X , 80> : return -> " + integerMap.replace("X", 44, 80));
        System.out.println("-".repeat(15));

        System.out.println(integerMap);


    }
}
