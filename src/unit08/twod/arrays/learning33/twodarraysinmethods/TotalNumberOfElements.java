package unit08.twod.arrays.learning33.twodarraysinmethods;


//method to display total number of elements in a 2D array
public class TotalNumberOfElements {
    public static void main(String[] args) {
        String[][] words = {{"apple", "banana"}, {"kiwi", "strawberry", "melon"}, {"pear", "apple"}};

        //call to the numberOfElements method using 2d String array words
        System.out.println(numberOfElements(words));
    }

    //new method to display numberOfElements
    public static int numberOfElements(String[][] array) {
        //new int counter starting from 0
        int counter = 0;
        //foreach array in the 2d array
        for (String[] words : array) {
            //foreach element in the arrays
            for (String word : words) {
                //increase the counter by 1
                counter++;
            }
        }
        //return the value of the counter to the method
        return counter;
    }
}
