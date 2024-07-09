package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 7 integers, stores them in an array, and prints the reversed array
public class Assignment17 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare an int array with size 7 to store user-entered integers
        int[] arr = new int[7];
        //prompt the user to enter up to 7 integers
        System.out.println("Enter up to 7 integers:");
        //read up to 7 integers entered by user and store them in the array
        for (int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        //call the getReversed method to get the reversed array
        int[] reversed = getReversed(arr);
        //print the reversed array
        System.out.println("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    //method to reverse the elements in the array
    public static int[] getReversed(int[] arr) {
        //initialize a new array to store the reversed elements
        int[] reversed = new int[arr.length];
        //loop through each element in the array from the end to the beginning
        for (int i = 0; i < arr.length; i++) {
            //store the elements in reverse order
            reversed[i] = arr[arr.length - 1 - i];
        }
        //return the reversed array
        return reversed;
    }
}
