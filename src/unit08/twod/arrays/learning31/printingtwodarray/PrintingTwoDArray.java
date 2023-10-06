package unit08.twod.arrays.learning31.printingtwodarray;

import java.util.Arrays;

//using Arrays.deepToString() to display 2d array information

public class PrintingTwoDArray {
    public static void main(String[] args) {
        boolean[][] votes = new boolean[4][2];
        String[][] words = new String[2][3];
        int[][] numbers = new int[6][3];
        //will not display the 2d array
        System.out.println(votes);
        //must use Arrays.deepToString()
        System.out.println(Arrays.deepToString(votes));
        System.out.println(Arrays.deepToString(words));
        System.out.println(Arrays.deepToString(numbers));

    }
}
