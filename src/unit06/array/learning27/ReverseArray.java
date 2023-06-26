package unit06.array.learning27;
//method to print an array in reverse
public class ReverseArray {
    public static void main(String[] args) {
        //new integer array created to be used and reversed
        int[] arr = {1, 2, 3, 4, 5, 6};
        //assign the value of the array to the reverseArray method
        arr = reverseArray(arr);
        //call to the printArray method to display the array
        printArray(arr);
    }

    //method to print array
    public static void printArray(int[] arr) {
        //foreach element in the array
        for (int num : arr) {
            //print out the element
            System.out.print(num + " ");
        }
    }

    //method to reverse an array
    public static int[] reverseArray(int[] firstArray) {
        // create a new integer array with the same length as firstArray
        int[] secondArray = new int[firstArray.length];
        // iterate over each index i of firstArray
        for (int i = 0; i < firstArray.length; i++) {
            // assign the value of firstArray[i] to the matching index in secondArray
            // the index in secondArray is calculated as secondArray.length - 1 - i
            secondArray[secondArray.length - 1 - i] = firstArray[i];
        }
        // return the reversed array
        return secondArray;
    }
}
