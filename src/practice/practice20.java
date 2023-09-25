package practice;

import java.util.ArrayList;
//practice array list methods to return even and odd numbers to an array list
public class practice20 {
    public static void main(String[] args) {
        //create an array list calling to the createEvenNumbers() method to fill the numbers in the list
        ArrayList<Integer> numbers = createEvenNumbers();
        //display the numbers from the array list
        System.out.println("even numbers: "+numbers);
        //create new array list calling to the odd numbers method
        ArrayList<Integer> numbers2 = createOddNumbers();
        //display the odd numbers in the array list
        System.out.println("odd numbers: "+numbers2);
        ArrayList<Integer> sumArrayEven = new ArrayList<>();
        //another way to add all elements from another array list
        sumArrayEven.addAll(numbers);
        System.out.println("another way to add all elements from another array list "+ sumArrayEven);


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
        //another way to write it
        //for (int i = 0; i <= 100; i = i + 2);
        //evenNumbers.add(i);
        //return the evenNumbers array list to the createEvenNumbers method
        return  evenNumbers;
    }

    //array list method to return all odd numbers 0-100
    public static ArrayList<Integer> createOddNumbers(){
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                oddNumbers.add(i);
            }
        }
        //another way to write it
        //for (int i = 100; i <= 0; i = i + 2);
        //evenNumbers.add(i);
        return oddNumbers;
    }
}
