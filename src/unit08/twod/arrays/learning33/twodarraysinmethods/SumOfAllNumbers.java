package unit08.twod.arrays.learning33.twodarraysinmethods;


//method to return the sum of all elements from a 2D array
public class SumOfAllNumbers {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13}, {14, 15, 16, 17}};

        int sum = 0;

        //starting from the first index until the rows length (arrays)
        for (int i = 0; i < numbers.length; i++) {
            //starting from the first index until the columns length (each element inside each array)
            for (int j = 0; j < numbers[i].length; j++) {
                //add each element from each array to the sum
                sum += numbers[i][j];
            }
        }
        //display the sum
        System.out.println(sum);
        //call to the returnSum method to return the sum
        System.out.println(returnSum(numbers));
    }

    //method to return the sum of a 2d array
    public static int returnSum(int[][] numbers){
        //int sum starting from 0
        int sum = 0;
        //foreach array in the 2d array
        for (int[] num : numbers) {
            //for each number in the array
            for (int number : num) {
                //add each number to the sum
                sum += number;
            }
        }
        //return the value of the sum to the method
        return sum;
    }
}
