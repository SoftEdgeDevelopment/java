package unit06.array.day25.arrayalgorithms;
//method to find the max value index in the array
public class FindMaxIndex {
    public static void main(String[] args) {
        int[] numbers = {63, 6, 456, 457, 45, 74, 56, 34523, 2, 345, 23, 45, 236, 4};
        // call the findMaxIndex method and pass the numbers array to find the index of the maximum element
        int maxIndex = findMaxIndex(numbers);
        // print the index of the maximum number in the array
        System.out.println("The index of the maximum number in the array is " + maxIndex);
    }

    // method to find the index of the maximum element in the array
    public static int findMaxIndex(int[] arr) {
        // initialize the maxIndex variable with 0, assuming the first element has the maximum value initially
        int maxIndex = 0;

        // iterate over each element of the array, starting from the first element (index 0)
        for (int i = 0; i < arr.length; i++) {
            // compare each number with the value at the maxIndex position
            if (arr[i] > arr[maxIndex]) {
                // update maxIndex to the current index if the current number is greater than the value at arr[maxIndex]
                maxIndex = i;
            }
        }

        // return the maxIndex value, which represents the index of the maximum element in the array
        return maxIndex;
    }
}
