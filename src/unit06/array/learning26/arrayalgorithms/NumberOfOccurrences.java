package unit06.array.learning26.arrayalgorithms;

//methods to return the amount of occurrences in String / int arrays
public class NumberOfOccurrences {
    public static void main(String[] args) {
        String[] fruit = {"apples", "bananas", "pears", "oranges", "watermelon", "apples"};
        int [] amount = {3,7,76,4,5,7,98,5,23,6,74,8,7,12,4,53,7};
        System.out.println(numberOfOccurrences(fruit, "oranges"));
        System.out.println(numberOfOccurrences(fruit, "apples"));
        System.out.println(numberOfOccurrences(fruit, "peaches"));
        //---------------------------------------------------------------
        System.out.println(numberOfOccurrences(amount,7));
    }
    //method to return for String array
    public static int numberOfOccurrences(String[] arr, String key) {
        //initial occurrences counter starting at 0
        int occurrences = 0;
        //for each word element in the array
        for (String word : arr) {
            //if the String key equals the word (ignore case)
            if (key.equalsIgnoreCase(word)) {
                //increase the occurrences by 1
                occurrences++;
            }
        }
        //return the amount of occurrences of the word in the array
        return occurrences;
    }
    //method to return for integer array
    public static int numberOfOccurrences(int[] arr, int key) {
        int occurrences = 0;
        for (int num : arr) {
            if(num == key){
                occurrences++;
            }
        }
        return occurrences;
    }
}
