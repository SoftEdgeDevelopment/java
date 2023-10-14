package unit08.twod.arrays.learning32.traversingtwodarray;

import java.util.Arrays;

//traversing 2D array to display all contents using foreach loop

public class EnhancedForLoop {
    public static void main(String[] args) {
        //new 2D array for numbers
        //rows go vertical
        //columns go horizontal
        int[][] twoDnumbers = {{11, 12, 13, 14}, {16, 17, 18, 19, 21}, {21, 22, 23}, {26, 27, 28, 29, 30}};

        for (int[] row : twoDnumbers) {
            System.out.println(Arrays.toString(row));
        }

    }
}
