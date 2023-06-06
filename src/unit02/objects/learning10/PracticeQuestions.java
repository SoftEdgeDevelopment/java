package unit02.objects.learning10;

public class PracticeQuestions {
    public static void main(String[] args) {
        //new String for a sentence
        String str1 = "Java Strings are awesome!";
        //will display the last index in the sentence as a string
        System.out.println(str1.substring(str1.length() -1));

//        second q.
        String s1 = "Java Strings";
        String s2 = "Techno Study";
//        Study Java
        //new string for the substring of index location 7 on String s2 "Study"
        String st = s2.substring(7);
        //will display "Study"
        System.out.println(st);
        //new string for the substring of chars between index 0-4 on string s1
        String jv = s1.substring(0, 4);
        //will display "Java:
        System.out.println(jv);
        //will add the value of st and jv to write "Study Java"
        System.out.println(st + " " + jv);
    }
}
