package unit06.array.day26.arrayalgorithms;

public class FinMin {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {345,64564,7675,2342,75467567,2334,664};
        //call to the findMin method using the numbers array to find the smallest element
        System.out.println(findMin(numbers));
    }
    public static int findMin(int [] arr){
        //assume the first element in the array is the minimum
        int min = arr[0];
        //for element starting at 0, until array length, go to the next element
        for (int i = 0; i < arr.length; i++) {
            //if the element in the array is smaller than the minimum
            if(arr[i] < min){
                //assign the new value of the minimum to the smaller element
                min = arr[i];
            }
        }
        //return the value of the min to the method
        return min;
    }
}
