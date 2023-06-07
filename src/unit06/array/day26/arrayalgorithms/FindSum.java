package unit06.array.day26.arrayalgorithms;

public class FindSum {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {34, 64, 27, 23, 75, 234, 66};
        //call to the findSum method for the numbers array
        System.out.println(findSum(numbers));
    }

    public static int findSum(int[] arr) {
        //the starting sum is 0
        int sum = 0;
        //foreach element in the array
        for (int num : arr) {
            //add each number to the value of the sum
            sum += num;
        }
        //return the sum to the method
        return sum;
    }

}
