package unit06.array.learning27;
//method to return the index value of the largest element in an array
public class FindMaxElementIndex {
    public static void main(String[] args) {
        //new int array with numbers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //call to the indexOfMaxElement using arraying to display the index of the largest element
        System.out.println(indexOfMaxElement(arr));
    }

    public static int indexOfMaxElement(int[] arr) {
        //new int for the starting index of max element assuming it is index 0;
        int indexOfMaxElement = 0;
        //starting from 0 until the array length, check each index
        for (int i = 0; i < arr.length; i++) {
            //if the index in the array is greater than the initial max element(0)
            if(arr[i] > arr[indexOfMaxElement]){
                //update the max element to the value of the arrays index
                indexOfMaxElement = arr[i];
            }
        }
        //return the index of the max element to the metho
        return indexOfMaxElement;
    }
}
