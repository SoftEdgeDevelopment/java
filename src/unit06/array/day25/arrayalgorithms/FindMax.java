package unit06.array.day25.arrayalgorithms;
//find the min value in the array and print it, and another example as a method
public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {6345, 6, 456, 457, 45, 74, 56, 345, 2, 345, 23, 45, 236, 4};
        // initialize the maximum value with the first element of the array
        //int max = Integer.MAX_VALUE
        int max = numbers[0];
        // for each element (num) in the array (numbers)
        for (int num : numbers) {
            // check if the current number is greater than the current maximum
            if (num > max) {
                // update the maximum value to the current number
                max = num;
            }
        }
        // print the maximum number
        System.out.println("The maximum number in the array is " + max);
        //call to the method to return the maximum number
        System.out.println(returnMax(numbers));
    }
    //create it as a method
    public static int returnMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        //return the value of the max to the method
        return max;
    }
}
