package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "London", "Toronto"));
        System.out.println(cities);
        //changes the name of index 0 in the array list
        cities.set(0,"Renton");
        System.out.println(cities);
        //changes and displays the name of index 1 in the array list - displays which one is being changed
        System.out.println(cities.set(1,"Seattle"));
        System.out.println(cities);
    }
}
