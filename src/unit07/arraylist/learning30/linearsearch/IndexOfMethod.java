package unit07.arraylist.learning30.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

//method to get the index of elements in an array list

public class IndexOfMethod {
    public static void main(String[] args) {
        //new array list aslist for numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 23, 123, 124, 9, 123, 41, 234));
        //returns the index of the element
        System.out.println(numbers.indexOf(9));
        //gets the index position to display the element
        System.out.println(numbers.get(5));
        //not found in the list, it will return -1 to terminal
        System.out.println(numbers.indexOf(11));

        //new array list aslist for countries
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Morocco", "USA", "Turkey","France", "England", "Scotland"));
        System.out.println(countries.indexOf("USA"));
        System.out.println(countries.indexOf("France"));
        System.out.println(countries.indexOf("Canada"));
    }
}
