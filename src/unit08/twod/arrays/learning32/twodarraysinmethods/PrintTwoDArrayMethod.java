package unit08.twod.arrays.learning32.twodarraysinmethods;

import java.util.Arrays;

//method to print the contents of a 2D array

public class PrintTwoDArrayMethod {
    public static void main(String[] args) {
        //new 2d String array with assigned words
        String[][] words = {
                {"hi","bye"},
                {"good","bad","maybe"},
                {"okay"}
        };
        //call to the method to print the 2d array
        printTwoDArray(words);
        //call to the produceTwoDStringArray method to produce a new String array
        System.out.println(Arrays.deepToString(produceTwoDStringArray()));
    }

    //new void method to print 2d array with 2d String array as parameter
    public static void printTwoDArray(String[][] arr){
        //using Arrays.deepToString() for 2d array
        System.out.println(Arrays.deepToString(arr));
    }

    //new 2d String array method to produce a new 2d String array
    public static String[][] produceTwoDStringArray(){
        //create new 2d String array
        String[][] a2DArray = new String[5][2];
        //return the 2d array back to the method
        return a2DArray;
        //return new String[5][2];
    }
}
