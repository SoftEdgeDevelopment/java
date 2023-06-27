package unit06.array.learning27;
//method to return the shortest word in an array
public class FindShortestWord {
    public static void main(String[] args) {
        //String array for different types of length words
        String[] animals = {"dog", "fish", "horse", "buffalo"};
        //call to the findShortestWord method to display the shortest word in the array
        System.out.println(findShortestWord(animals));
    }

    public static String findShortestWord(String[] arr) {
        //new String shortest to find the shortest word and assign it to index 0 of the array
        String shortest = arr[0];
        //foreach word in the array
        for (String word : arr) {
            //if the length of the word is greater than the length of the previous shortest
            if(word.length() < shortest.length()){
                //assign the new value of the shortest to the word in the array
                shortest = word;
            }
        }
        //return the shortest word in the array
        return shortest;
    }

}
