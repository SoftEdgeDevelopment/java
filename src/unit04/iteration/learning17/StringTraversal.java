package unit04.iteration.learning17;

public class StringTraversal {
    public static void main(String[] args) {
        String str1 = "Hello";

        //starting at 0, until String str1 length, add 1
        for (int i = 0; i < str1.length(); i++) {
            //display the substring at beginning index i, and end index i + 1, this will only give 1 letter at a time
            System.out.println(str1.substring(i, i+1));
            //display the char at index location i in String str1
            System.out.println("with charAt(i) " + str1.charAt(i));
        }
        //display this at the end of the for loop
        System.out.println("Something");
    }
}
