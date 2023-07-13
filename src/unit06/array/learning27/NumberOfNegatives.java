package unit06.array.learning27;
//method to return the amount of negative numbers in an array
public class NumberOfNegatives {
    public static void main(String[] args) {
        //new integer array created for numbers
        int [] numbers = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        //call to the method using the numbers array to display how many negative numbers are in the array
        System.out.println(numOfNegatives(numbers));
    }
    public static int numOfNegatives(int[] arr) {
        //new int for counter for number of negatives in the array
        int counter = 0;
        //for each number element in the array
        for (int num : arr) {
            //if the number is less than 0
            if(num < 0){
                //increase the counter for the negatives
                counter++;
            }
        }
        //return the counter to the method
        return counter;
    }
}
