package javaprojects.project03;
//find the longest String that contains a specific char
public class Assignment01 {
    //Given three String variables of some text, find and print the longest word that also
    //contains 'a' . You should check each variable manually
    public static void main(String[] args) {
        //create 3 word variables to check them
        String word1 = "java";
        String word2 = "computers";
        String word3 = "apples";
        //create new int variables to check the length of each String
        int w1 = word1.length(); //4
        int w2 = word2.length(); //9
        int w3 = word3.length(); //6
        //create new boolean variables to check if the Strings contain that char letter 'a'
        boolean w1Has = word1.contains("a"); //true
        boolean w2Has = word2.contains("a"); //false
        boolean w3Has = word3.contains("a"); //true
        //after manually checking, display the longest word
        System.out.println("\""+word3+"\"" + " is the longest word that also contains the letter \"'a'\"");
        //display the length of the word
        System.out.println("the length of \""+word3+"\"" + " is " + word3.length() + " letters");
        //display if it contains the char 'a'
        System.out.println("Does \""+word3+"\"" + " contain \"a\" : " + w3Has);
    }
}
