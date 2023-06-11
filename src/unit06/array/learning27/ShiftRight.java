package unit06.array.learning27;
//method to shift elements in the array to the right
public class ShiftRight {
    public static void main(String[] args) {
        //first array with assigned values
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //seconds array assigned to the length of the first array
        int[] secondArray = new int[firstArray.length];
        //for loop for the first element until 1 before the last element (last element will be shifted last)
        for (int i = 0; i < firstArray.length - 1; i++) {
            //get the element in the index of the first array, and assign it to the value on the second array next index
            secondArray[i + 1] = firstArray[i];
        }
        //last element in the first array assigned to the first element on the second array
        secondArray[0] = firstArray[firstArray.length - 1];
        //print the original array
        printArray(firstArray);
        //update the first array so it is shifted,
        firstArray = secondArray;
        //call to the printArray method to display the numbers
        System.out.print("Shifted : ");
        printArray(firstArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
