package unit06.array.learning27;
//method to print words that ends with a specific char sequence
public class PrintSpecificEnding {
    public static void main(String[] args) {
        //create string array with words
        String[] arr = {"Captain", "Caption", "Ration","Lake","Key","Vacation"};
        //call to the EndingInIon method using the string array to check which words end in "ion"
        endingInIon(arr);
    }

    //new public static method to print the words ending in ion of the string array
    public static void endingInIon(String[] arr) {
        //for each word in the array
        for (String word : arr) {
            //if the word ends with "ion"
            if(word.endsWith("ion")){
                //print the word
                System.out.println(word);
            }
        }
    }
}
