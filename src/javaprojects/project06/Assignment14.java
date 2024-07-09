package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 10 integers, stores them in an array, and prints the total count of even numbers in the array
public class Assignment14 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare an int array with size 10 to store user-entered integers
        int[] arr = new int[10];
        //prompt the user to enter up to 10 integers
        System.out.println("Enter up to 10 integers (press enter after each):");
        //read up to 10 integers entered by user and store them in the array
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        //call the getEvenCount method to find the total count of even numbers in the array
        int evenCount = getEvenCount(arr);
        //print the result
        System.out.println("The total count of even numbers is: " + evenCount);
    }

    //method to find the total count of even numbers in the array
    public static int getEvenCount(int[] arr) {
        //initialize count variable to 0
        int count = 0;
        //loop through each element in the array
        for (int num : arr) {
            //check if the current element is even
            if (num % 2 == 0) {
                //increment the count if the element is even
                count++;
            }
        }
        //return the total count of even numbers
        return count;
    }
}
