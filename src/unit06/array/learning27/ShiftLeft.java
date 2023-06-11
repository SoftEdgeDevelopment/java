package unit06.array.learning27;
//method to shift each element in an array to the left
public class ShiftLeft {
    public static void main(String[] args) {
        //create an array and assign values to each element
        int[] firstArray = {1,2,3,4};
        //create a second array and assign it to the length of the first array
        int[] secondArray = new int[firstArray.length];
        //for the second element until the length of the array
        for (int i = 1; i < firstArray.length; i++) {
            //assign the value of the previous element in the second array to the value of element in the first array
            secondArray[i-1] = firstArray[i];
        }
        //assign the first element in the first array to the last value of the element in the second array
        secondArray[secondArray.length-1] = firstArray[0];
        //print the first array
        printArray(firstArray);
        //assign the value of the first array to the second array
        firstArray=secondArray;
        //display the updated shifted array
        System.out.println();
        printArray(firstArray);

    }

    //method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
