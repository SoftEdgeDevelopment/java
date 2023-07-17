package unit07.arraylist.learning28.arraylistmethods;

import java.util.ArrayList;
//array list method example to add elements in an array list
public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //add a number to the list
        numbers.add(10);
        //display the updated array list
        System.out.println(numbers);
        //add another number to the list
        numbers.add(20);
        //display the updated array list
        System.out.println(numbers);
        //add more numbers to the list
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        //display the updated array list
        System.out.println(numbers);
        //adds a new index location in the array list with an assigned element value
        numbers.add(0,5);
        //display the updated array list
        System.out.println(numbers);
    }
}
