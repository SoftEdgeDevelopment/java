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
    }
}
