package practice;

import java.util.ArrayList;
//practice array list method to return even numbers to an array list
public class practice20 {
    public static void main(String[] args) {
        //create an array list calling to the createEvenNumbers() method to fill the numbers in the list
        ArrayList<Integer> numbers = createEvenNumbers();
        //display the numbers from the array list
        System.out.println(numbers);

    }

    public static ArrayList<Integer> createEvenNumbers() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        //for each index starting from 0 until 100
        for (int i = 0; i <= 100; i++) {
            //checks if the index is an even number
            if (i % 2 == 0) {
                //add it to the evenNumbers array list if it is even
                evenNumbers.add(i);
            }
        }
        //return the evenNumbers array list to the createEvenNumbers method
        return  evenNumbers;
    }
}
