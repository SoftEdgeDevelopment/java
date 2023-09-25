package unit07.arraylist.learning29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
//method to remove all even numbers from an array list
public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-34, -55, 45, 23, 78, 90, 12, 33, -12, 47));
        System.out.println("all numbers: "+numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 ==0){
                numbers.remove(i);
            }

        }
        System.out.println("odd numbers: "+numbers);
    }

}
