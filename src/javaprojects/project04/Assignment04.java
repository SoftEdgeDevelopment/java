package javaprojects.project04;

public class Assignment04
{
    //given two string variables word1 and word2.
    //You need to check if they are equal using an if.
    //Comparison should be case-sensitive. “java” and “JaVa” are not equal.
    //If they are equal, print output “word1 equals word2”
    //Else, print output “word1 does not equal word2”

    //make 2 strings and check if they are equal
    public static void main(String[] args) {
        String word1 = "Java";
        String word2 = "Java";

        if (word1.equals(word2)){
            System.out.println("Word1 and Word2 are the same");
        }
        else{
            System.out.println("Word1 and Word2 are not the same ");
        }
    }
}
