package unit07.arraylist.learning28.arraylistcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//array list method to return as a collection
public class ArrayListConstructors {
    public static void main(String[] args) {
        //create new array list
        ArrayList<Integer> numbers = new ArrayList<>();
        //assign elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        //send numbers as a collection to array list numbers2
        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);
        //Arrays.asList() method returns a collection
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30,40,50,60));
        System.out.println(numbers3);

        //creating new string array for words
        String[] wordsArray = {"a", "an", "an", "at"};
        //creating array list with collection from wordsArray
        ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        //adding new words into the array list
        words.add(4,"and");
        words.add(5, "all");
        System.out.println(words);


        //array list using List.of
        ArrayList<String> cities = new ArrayList<>(List.of("Seattle", "San Francisco", "Los Angeles", "Chicago"));
        System.out.println(cities);
    }
}
