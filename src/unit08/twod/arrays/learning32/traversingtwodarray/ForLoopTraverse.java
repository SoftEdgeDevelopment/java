package unit08.twod.arrays.learning32.traversingtwodarray;

//traversing 2D array to display all contents in the rows / columns

public class ForLoopTraverse {
    public static void main(String[] args) {
        //new 2D array for numbers
        //rows go vertical
        //columns go horizontal
        int[][] twoDnumbers = {
                {11,12,13,14},
                {16,17,18,19,21},
                {21,22,23},
                {26,27,28,29,30}
        };

        //for each row in the 2d array until the 2d arrays length, go through each row
        for(int row = 0; row < twoDnumbers.length; row++){
            //goes through each column and gets the length of each array
            for(int column = 0; column < twoDnumbers[row].length; column++){
                //prints all the contents in order of the 2d array
                System.out.print(twoDnumbers[row][column]+" ");
            }
            //adding space between each array in the 2d array list
            System.out.println();

        }

    }
}
