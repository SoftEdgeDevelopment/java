package unit08.twod.arrays.learning33.twodarraysinmethods;

//method to return the smallest element of a 2d array

public class FindMinimumValue {
    public static void main(String[] args) {
        int[][] numbers = {
                {52, 81, 25},
                {1067, 34, 71},
                {14, 92, 43}
        };

        //call to the returnValue() method to display the smallest number
        int min = returnValue(numbers);
        System.out.println("Minimum value in the array is: " + min);

        //call to the returnValue() method to display the smallest number
        System.out.println("The Minimum value in the array is: "+returnValue(numbers));
    }

    public static int returnValue(int[][] numbers) {
        //assume the minimum number is interger MAX VALUE
        int min = Integer.MAX_VALUE;
        //foreach number array in the numbers 2d array
        for (int[] numArray : numbers) {
            //foreach number in each array
            for (int num : numArray) {
                //if the number is less than the min
                if (num < min) {
                    //assign the new value of the min to the smaller number found
                    min = num;
                }
            }
        }
        //return the minimum number
        return min;
    }
}
