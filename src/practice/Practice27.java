package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice27 {
    //practice interview style question using map and set
    public static void main(String[] args) {
        //gives the count for number of words in the sentence
        String sentence = "rainy and sunny days are nice but rainy and windy days are also nice too";

        /* Task 1: Give the number of words that are used in the sentence */
        String[] words = sentence.split(" "); // Use space as a delimiter to split the sentence into words
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);

        /* Task 2: Give the number of letters used in the word Pneumonoultramicroscopicsilicovolcanoconiosis */
        String longWord = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        int letterCount = longWord.length();
        System.out.println("Number of letters in the word 'Pneumonoultramicroscopicsilicovolcanoconiosis': " + letterCount);


        //--------------------------------------------------------------------------------------
        //gives the count for each word used in the sentence
        System.out.println("-".repeat(30));
        String sentence2 = "rainy and sunny days are nice but rainy and windy days are also nice too";

        // Split the sentence into words
        String[] words2 = sentence.split(" ");

        // Create a map to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words2) {
            // Increment count if word already exists in the map
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Otherwise, initialize count to 1
                wordCountMap.put(word, 1);
            }
        }
        // Print the word counts
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        //-------------------------------------------------------------------------------
        //unique number of letters using Set
        System.out.println("-".repeat(15));

        // Count the number of unique letters in the word "Pneumonoultramicroscopicsilicovolcanoconiosis"
        String longWord3 = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : longWord3.toCharArray()) {
            uniqueLetters.add(c);
        }
        // Print the number of unique letters
        System.out.println("Number of unique letters in 'Pneumonoultramicroscopicsilicovolcanoconiosis': " + uniqueLetters.size());
    }
}
