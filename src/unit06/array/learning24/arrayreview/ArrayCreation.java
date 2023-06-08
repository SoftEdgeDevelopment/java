package unit06.array.learning24.arrayreview;
//practice creating arrays and methods calling to the main class
public class ArrayCreation {
    public static void main(String[] args) {
        //create int array with 5 elements
        int[] intArray = new int[5];
        //create a new array with initializer list
        int[] intArray2 = {23,42,63,85,78};
        //assign the last index element to the value of 50
        intArray[intArray.length - 1] = 50;
        //assign the first index element to the value of 18
        intArray[0] = 18;
        //print the last index element
        System.out.println(intArray[intArray.length - 1]);
        //or call the last index manually
        System.out.println(intArray[4]);
        //call to the get first element method to display the first index element in the array
        getFirstElement(intArray);
        //display first element of second array
        getFirstElement(intArray2);
        //create new array calling to the returnThreeElements method
        int[] arr2 = returnThreeElements();
        //call to getFirstElement method to display the first index of arr2
        getFirstElement(arr2);
    }
    //method that takes integer array as parameter and prints the first element
    public static void getFirstElement(int[] numbers){
        //print the first element of the array
        System.out.println(numbers[0]);
    }
    //method to create integer array with 3 elements as 20, 30, 40, and return the array
    public static int[] returnThreeElements(){
        //create new array with 3 elements
        int[] arr = {20,30,40};
        //return the array to the method
        return arr;
    }
}
