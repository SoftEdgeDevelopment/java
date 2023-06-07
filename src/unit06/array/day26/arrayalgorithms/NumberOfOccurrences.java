package unit06.array.day26.arrayalgorithms;
//method to return the amount of occurrences in a String array
public class NumberOfOccurrences {
    public static void main(String[] args) {
        String[] fruit = {"apples", "bananas", "pears", "oranges", "watermelon","apples"};
        System.out.println(numberOfOccurrences(fruit, "oranges"));
        System.out.println(numberOfOccurrences(fruit,"apples"));
        System.out.println(numberOfOccurrences(fruit,"kiwi"));
    }

    public static int numberOfOccurrences(String[] arr, String key) {
        //initial occurrences counter starting at 0
        int occurrences = 0;
        //for each word element in the array
        for (String word : arr) {
            //if the String key equals the word (ignore case)
            if(key.equalsIgnoreCase(word)){
                //increase the occurrences by 1
                occurrences++;
            }
        }
        //return the amount of occurrences of the word in the array
        return occurrences;
    }
}
