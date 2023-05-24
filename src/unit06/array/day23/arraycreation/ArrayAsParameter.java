package unit06.array.day23.arraycreation;
//create methods to print the index of different elements in the array, call all the methods to the main
public class ArrayAsParameter {
    public static void main(String[] args) {
        //new int array created with 5 different numbers, index 0-4
        int[] intArr = {37,72,84,79,98,27,13,91};
        int[] intArr2 = {1,3,5,7,9,11,13,15};
        //call to the print element method to display the first index of the array
        printFirstElement(intArr);
        //call to print the last element method
        printLastElement(intArr);
        //print the middle index element method using intArr and intArr2
        System.out.println(returnMiddleElement(intArr));
        System.out.println(returnMiddleElement(intArr2));
        //create new array 2 integers long
        int[] myArray = new int[2];
        //calling to the method return first and last array using intArr as parameter
        myArray = returnFirstLastArray(intArr);
        //print index 0 of myArray - will call to the return first and last method and will display the first index value in intArr
        System.out.println(myArray[0]);
        //print index 1 of myArray - will call to the return first and last method and will display the last index value in intArr
        System.out.println(myArray[1]);
        //this will not work printing anything
        System.out.println(intArr);   //wont work properly
        System.out.println(myArray);  //wont work properly
    }
    //new public static method to print
    //use an array as the parameter
    public static void printFirstElement(int[] numbers){
        //print the first index value of the array
        System.out.println(numbers[0]);
    }
    //new method to call to the last element index value of the array
    public static void printLastElement(int[] numbers){
        //print the last index value of the array
        System.out.println(numbers[numbers.length - 1]);
    }
    //new method to return the middle element with int array as parameter
    public static int returnMiddleElement(int[] numbers) {
        //checks if the index length is evenly divisible by 2 (it is an even number)
        if(numbers.length % 2 == 0) {
            //return the least index number of the middle index between the 2
            return numbers[(numbers.length / 2) - 1];
        }
        else{
            //returns the middle index of an odd number
            return numbers[numbers.length / 2];
        }
    }
    //new array method using the array as parameter to return the value of the first and last index of the array
    public static int[] returnFirstLastArray(int[] numbers){
        int[] arr = new int[2];
        //assign index 0 to the value of the first element in the array
        arr[0] = numbers[0];
        //assign index 1 to the value of the last element in the array
        arr[1] = numbers[numbers.length - 1];
        //return the value of arr
        return arr;
    }
}
