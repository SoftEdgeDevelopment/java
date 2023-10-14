package practice;

public class Practice24 {

    //method to combine and change values in a 2d array
    public static void main(String[] args) {
        //new 2d array with assigned arrays values
        int[][] numbers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,345,7,35},
                {11,16,856},
                {116,1116,34}
        };
        //prints number 8 to the screen
        System.out.println(numbers[1][3]);
        //print 491116
        //this will print the total value of the numbers
        System.out.println(numbers[0][3]+numbers[2][0]+numbers[4][1]);
        //must add "" before to convert to String format
        System.out.println("" + numbers[0][3]+numbers[2][0]+numbers[4][1]);
        //other ways to write it calling to different indexes
        System.out.println("using other indexes: " + numbers[0][3]+numbers[2][0]+numbers[3][0]+numbers[3][1]);
        System.out.println("using more indexes: " + numbers[0][3]+numbers[2][0]+numbers[0][0]+numbers[3][0]+numbers[1][1]);

        // updating the elements
        numbers[1][0] = 99;
        //change 1116 to 6666
        numbers[4][1] = 6666;
        System.out.println(numbers[4][1]);
        //how to print the last arrys length of the array in the 2D array
        System.out.println("the last arrays length in the 2D array is: "+numbers[numbers.length - 1].length);
    }
}
