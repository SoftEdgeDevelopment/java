package unit06.array.day26.arrayalgorithms;

public class FindMax {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {345,64564,7675,2342,75467567,2334,664};
        //call to the findMax method using numbers array
        System.out.println(findMax(numbers));

    }

    public static int findMax(int[] arr) {
        //assume the first element in the array is the largest number
        int max = arr[0];
        //foreach element in the array
        for (int num : arr) {
            //if the element is larger than the max
            if (num > max){
                //the new max value is assigned to the larger number
                max = num;
            }
        }
        //return the value of the max to the method
        return max;
    }
}
