package javaprojects.project06;

//import scanner class for user input
import java.util.Scanner;

//prompts the user to enter up to 10 integers, stores them in an array, and computes the sum of the squares of these elements
public class Assignment11 {
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
        //call the getTotal method to compute the sum of the squares of the elements in the array
        int total = getTotal(arr);
        //print the result
        System.out.println("The total sum of squares is: " + total);
    }

    //method to compute the sum of the squares of the elements in the array
    public static int getTotal(int[] arr) {
        //initialize sum variable
        int sum = 0;
        //loop through each element in the array
        for (int num : arr) {
            //compute the square of the element and add it to the sum
            sum += num * num;
        }
        //return the total sum of squares
        return sum;
    }
}
