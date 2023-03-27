package unit02.objects.day10;

public class RevisitStringMethods {
    public static void main(String[] args) {
        //new String variable of a word
        String str1 = "California";
        //will display the number of characters contained in the String
        System.out.println(str1.length());
        //will search for the start index of f in "for"
        System.out.println(str1.indexOf("for"));
        //will not be able to find index because this is not contained in the String
        System.out.println(str1.indexOf("form"));
        //gets 2 parameters, will display the characters contained in the String between the index of 2-4
        System.out.println(str1.substring(2, 4));
        //gets 1 parameter, will display the characters contained in the String after the index of 7
        System.out.println(str1.substring(7));
        //gets 1 parameter - the index of the char 'n' - will display everything after that
        System.out.println(str1.substring(str1.indexOf("n")));

    }
}
