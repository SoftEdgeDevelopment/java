package unit07.arraylist.learning29.traversingarraylist;

import java.util.ArrayList;
import java.util.Arrays;
//for loop and while loop to display all contents of an array list
public class ForLoopExampleCities {
    public static void main(String[] args) {
        //new arraylist as list with city names
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Manhattan","Chicago","Boston","Seattle","Tokyo"));
        //for each element in the array
        for (int i = 0; i < cities.size(); i++) {
            //display each city using .get
            System.out.print(cities.get(i)+" ");
        }

        //while loop to display all the cities in the array
        int index = 0;
        while(index < cities.size()){
            System.out.print(cities.get(index) + " ");
            index++;
        }
    }
}
