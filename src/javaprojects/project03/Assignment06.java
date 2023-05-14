package javaprojects.project03;

public class Assignment06 {
    //Given two words. Print the first word without its first character then print the second word
    //without its last character
    public static void main(String[] args) {
        //new variables for 2 words
        String word1 = "apple";
        String word2 = "banana";
        //print the first word without its first char
        System.out.println(word1.substring(1,5));
        //print the second word without its last char
        System.out.println(word2.substring(0,5));
    }
}