package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;
//array list as method using collection to display list of numbers
public class CreateWithArraysMethod {
    public static void main(String[] args) {
        //new array list using Arrays.asList to get a collection of numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //display the numbers from the array list
        System.out.println(numbers);
        //new array list numbers2
        ArrayList<Integer> numbers2 = new ArrayList<>();
        //add elements to the array list
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        System.out.println(numbers2);
        //new array list numbers3 collection from array list numbers2
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);
        System.out.println(numbers3);
    }
}
