package unit06.array.day25.foreach;

//foreach loop to print each element if the length is a certain amount
public class WordsLength {
    public static void main(String[] args) {
        //new String array for words
        String[] fruits = {"apple", "banana", "carrot", "date", "elephant"};
        //for each element in the array
        for (String word : fruits) {
            //if the elements length is 5 or more
            if (word.length() >= 5) {
                //print the element in the array
                System.out.println(word);
            }
        }
    }
}