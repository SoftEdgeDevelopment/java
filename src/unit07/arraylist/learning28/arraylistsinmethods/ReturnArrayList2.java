package unit07.arraylist.learning28.arraylistsinmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrayList2 {
    public static void main(String[] args) {
        //create new array list calling to the favoriteCities method to fill the array list
        ArrayList<String> cityList = favoriteCities();
        System.out.println(cityList);
    }

    //new array list method for favorite cities
    public static ArrayList<String> favoriteCities(){
        //create new array list for cities
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Seattle", "Renton", "New York"));
        //return the array list to the array list method
        return cities;
    }
}
