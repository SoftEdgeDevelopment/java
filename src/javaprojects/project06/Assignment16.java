package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 7 integers, stores them in an array, and prints the element that is entered only once
public class Assignment16 {
    //main method where program execution begins
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //declare an int array with size 7 to store user-entered integers
        int[] arr = new int[7];
        //prompt the user to enter up to 7 integers
        System.out.println("Enter up to 7 integers (each element should be entered twice except one):");
        //read up to 7 integers entered by user and store them in the array
        for (int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        //call the getSingle method to find the element that is entered only once
        int single = getSingle(arr);
        //print the result
        System.out.println("The element entered once is: " + single);
    }

    //method to find the element that is entered only once in the array
    public static int getSingle(int[] arr) {
        //initialize variable to store the result
        int result = 0;
        //loop through each element in the array
        for (int num : arr) {
            //use XOR to find the single element (XOR of a number with itself is 0, and XOR of a number with 0 is the number itself)
            result ^= num;
        }
        //return the single element
        return result;
    }
}