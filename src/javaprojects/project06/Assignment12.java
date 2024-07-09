package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 5 integers, stores them in an array, and prints the maximum number of these elements
public class Assignment12 {
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
        //call the getMax method to find the maximum number in the array
        int max = getMax(arr);
        //print the result
        System.out.println("The maximum number is: " + max);
    }

    //method to find the maximum number in the array
    public static int getMax(int[] arr) {
        //initialize max variable to the smallest integer value
        int max = Integer.MIN_VALUE;
        //loop through each element in the array
        for (int num : arr) {
            //update max if the current element is greater
            if (num > max) {
                max = num;
            }
        }
        //return the maximum number
        return max;
    }
}
