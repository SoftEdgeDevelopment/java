package unit07.arraylist.learning29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

//method to display all cities starting with a specific letter and another method to display count

public class CountCities {
    public static void main(String[] args) {
        //new array list as list with city names
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Auburn", "Seattle", "Boston", "Aberdeen", "Tokyo"));
        //new array list aCities calling to the citiesStartingWithA method using the cities array list
        ArrayList<String> aCities = citiesStartingWithA(cities);
        //display aCities
        System.out.println("Cities starting with 'A': " + aCities);
        //call to the method to display the number of cities
        System.out.println(numOfACities(cities) + " cities");
    }

    //array list method using city array list to get all cities starting with A
    public static ArrayList<String> citiesStartingWithA(ArrayList<String> cityList) {
        ArrayList<String> aCities = new ArrayList<>();
        //foreach city in the array list
        for (String city : cityList) {
            //if the city starts with A
            if (city.startsWith("A")) {
                //add the city to the aCities array list
                aCities.add(city);
            }
        }
        return aCities;
    }

    //array list method to display number of cities starting with A
    public static int numOfACities(ArrayList<String> citiesList) {
        //starting counter for number of cities starting with A
        int counter = 0;
        //foreach city in the array list
        for (String city : citiesList) {
            if (city.substring(0,1).equalsIgnoreCase("a")){
                counter++;
            }
        }
        return counter;
    }
}

