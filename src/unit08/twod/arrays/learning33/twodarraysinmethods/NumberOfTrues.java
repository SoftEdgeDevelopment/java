package unit08.twod.arrays.learning33.twodarraysinmethods;

//method to return the total number of boolean votes in an array

public class NumberOfTrues {
    public static void main(String[] args) {
        //new boolean 2d array for votes
        boolean[][] votes = {{true, false, true, true}, {true, false, false, true}, {true, false, false, false}};

        //call to the method to return the total number of true votes
        System.out.println("The total votes of true are: "+returnTrues(votes));
    }

    //new method to return the number of true votes
    public static int returnTrues(boolean[][] arr) {
        //count starting from 0
        int count = 0;
        //for each boolean array in the 2d array
        for (boolean[] arrays : arr) {
            //for each vote in each boolean array
            for (boolean vote : arrays) {
                //if the vote is true
                if (vote == true){
                    //increase the count by 1
                    count++;
                }
            }
        }
        //return the count to the method
        return count;
    }
}
