package javaprojects.project03;


import java.util.Scanner;

public class Assignment08
{
    //program to replace the first word in a sentence to become the last word in a sentence
    //example "today i went to the store" == "i went to the store today"
    public static void main(String[] args)
    {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user for a sentence
        System.out.println("Enter a sentence");
        //get user input for the sentence
        String sentence = input.nextLine();
        //display the users original message
        System.out.println(sentence);
        //get the location of the end of the first word by finding the index of the first space in the sentence
        int spacePosition = sentence.indexOf(" ");
        //new variable gets the first word by finding substring from index position 1 and trimming the space after getting its index position 2
        String firstString = sentence.substring(0, spacePosition).trim();
        //new variable gets the remaining of the sentence from the index position of the space until the length of the rest of the string, times any remaining extra space
        String restOfSentence = sentence.substring(spacePosition, sentence.length()).trim();
        //get the position of the first char in the rest of the sentence
        String firstChar = restOfSentence.substring(0, 1);
        //update the value of the rest of the sentence to first char plus the substring of index 1 until the rest of the sentence length
        restOfSentence = firstChar + restOfSentence.substring(1, restOfSentence.length());
        //print the rest of the sentence first and the first string second to replace the first word to the last position
        System.out.println(restOfSentence + " " + firstString);
    }
}