package practice;

import java.util.Arrays;


//method to update 2d arrays
public class Practice21 {
    public static void main(String[] args) {
        //new boolean 2D array with 3 arrays 4 index each array
        boolean[][] booleans = new boolean[3][4];
        //way to print 2d arrays
        System.out.println(Arrays.deepToString(booleans));
        //update the booleans to true
        booleans[0][2] = true;
        booleans[2][1] = true;
        System.out.println(Arrays.deepToString(booleans));
    }
}
