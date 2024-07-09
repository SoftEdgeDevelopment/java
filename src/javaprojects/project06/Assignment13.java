package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 5 integers, stores them in an array, and prints the sum of these elements
public class Assignment13 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare an int array with size 5 to store user-entered integers
        int[] arr = new int[5];
        //prompt the user to enter up to 5 integers
        System.out.println("Enter up to 5 integers (press enter after each):");
        //read up to 5 integers entered by user and store them in the array
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        //call the getSum method to find the sum of the elements in the array
        int sum = getSum(arr);
        //print the result
        System.out.println("The sum of all numbers is: " + sum);
    }

    //method to find the sum of the elements in the array
    public static int getSum(int[] arr) {
        //initialize sum variable to 0
        int sum = 0;
        //loop through each element in the array
        for (int num : arr) {
            //add the current element to the sum
            sum += num;
        }
        //return the sum of all elements
        return sum;
    }
}
