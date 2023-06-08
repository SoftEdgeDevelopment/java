package unit06.array.learning24.traversingarray;
//create a new method to print the elements of a given array, and another method to print the elements of the given array backwards
public class PrintArray {
    //method to print the elements of a given array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
    public static void printArrayReverse(int[] arr){
        //for the last index in the element, until it is the first index (0), subtract the index by 1
        for (int i = arr.length - 1; i >= 0 ; i--) {
            //print in reverse
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //create a new array in the main method
        int[] myArr = {226,181,634,756,123,946};
        //call to the printArray method using the newly created array to print the array
        printArray(myArr);
        System.out.println("--------------------------");
        //call to the printArrayReverse method using newly created array to print the array
        printArrayReverse(myArr);
    }
}
