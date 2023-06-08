package unit06.array.day26.shiftarrayalgorithms;
//method to shift all elements in the array to the right
public class ShiftRight {
    public static void main(String[] args) {
        //create an array with values
        int[] array1 = {1, 2, 3, 4, 5,6,7,8};
        //create a new array assigned to the length of the first array
        int[] array2 = new int[array1.length];
        //starting from index zero until the last element in the array of the first array
        for (int i = 0; i < array1.length - 1; i++) {
            //array 2 shifted index location to the right by 1
            array2[i + 1] = array1[i];
        }
        //assign the value of the first element in the second array to the last element in the first array
        array2[0] = array1[array1.length - 1];
        System.out.print("Original Array : ");
        printArr(array1);
        System.out.println();
        //assign the value of array1 to array2
        array1 = array2;
        //call to the printArr method to display the shifted array
        printArr(array1);
    }
    //new static void method to print array
    public static void printArr(int[] arr) {
        //foreach element in the array
        for (int num : arr) {
            //display the number of the array
            System.out.print(num + " ");

        }
    }
}
