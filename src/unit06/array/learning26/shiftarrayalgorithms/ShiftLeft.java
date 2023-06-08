package unit06.array.learning26.shiftarrayalgorithms;
// method to shift all elements in the array to the left
public class ShiftLeft {
    public static void main(String[] args) {
        //create an array with initial values
        int[] array1 = {1, 2, 3, 4};
        //create a new array with the same length as array1
        int[] array2 = new int[array1.length];
        //shift the elements of array1 to the left by one position by copying each element starting from index 1 to the previous index in array2
        for (int i = 1; i < array1.length; i++) {
            array2[i - 1] = array1[i];
        }
        //move the first element of array1 to the last position in array2
        array2[array2.length - 1] = array1[0];
        //print the elements of array1
        printArr(array1);
        System.out.println();
        //print the elements of array2
        printArr(array2);
    }
    //method to print the elements of an array
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

