package unit07.arraylist.learning30.splitjoinmethods;

//split and join examples to split or join contents of an array

public class JoinMethodExample {
    public static void main(String[] args) {
        String sentence = "Today I went to the store and bought an apple";
        //sentence split
        String[] words = sentence.split(" ");
        //for each word in the words array list
        for (String word : words) {
            //use substring to get the index of the first letter and change to upper case
            // +
            // the word of the substring starting from the first index
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
        }
        //new string for the updated sentence
        //delimiter - what goes between each element
        //elements - select the elements to join
        String updatedSentence = String.join(" ",words);
        System.out.println("After Joining: \n" + updatedSentence);

        String[] someWords = {"Hello", "World", "of", "Java"};
        //uses a "-" to join each word in the array
        System.out.println(String.join("-", someWords));
    }
}
