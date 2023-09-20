package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;
//method to remove entries from an array list
public class RemoveMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "London", "Toronto"));
        System.out.println("cities before being removed: " + cities);
        //removes index from array list
        cities.remove(0);
        System.out.println("cities after index removal: " +cities);
        //element removed from array list and displayed
        System.out.println("element removed: " + cities.remove(0));
        System.out.println("cities remaining after removal: " +cities);
        //name doesn't exist so nothing will change
        cities.remove("this");
        System.out.println(cities);


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77));
        System.out.println("numbers: " + numbers);
        //remove index 3
        numbers.remove(3);
        System.out.println("numbers after removing index 3: " + numbers);
        //trying to remove the element 33 from the array list will result in failure
        //numbers.remove(33);
        //remove as an object using Integer.valueOf()
        numbers.remove(Integer.valueOf(33));
        System.out.println("numbers after removing element 33 using valueOf: " +numbers);
        //removes multiple entries searching from the array list
        numbers.removeAll(Arrays.asList(5,10,15,22,25,66,98));
        System.out.println("numbers after removing multiple indexes " +numbers);

    }
}
