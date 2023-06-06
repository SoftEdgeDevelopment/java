package unit06.array.day25.arrayalgorithms;
//find the min value in the array and print it
public class FindMin {
    public static void main(String[] args) {
        //new array for numbers
        int[] numbers = {6345, 6, 456, 457, 45, 74, 56, 345, 2, 345, 23, 45, 236, 4};
        // initialize the minimum value with the first element of the array
        //int min = Integer.MIN_VALUE
        int min = numbers[0];
        for (int num : numbers) {
            // check if the current number is smaller than the current minimum
            if (num < min) {
                // update the minimum value to the current number
                min = num;
            }
        }
        // print the minimum number
        System.out.println("The minimum number in the array is " + min);
    }
}
