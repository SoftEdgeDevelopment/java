package unit02.objects.day10;

public class PracticeQuestions {
    public static void main(String[] args) {
        String str1 = "Java Strings are awesome!";
        System.out.println(str1.substring(str1.length() - 1));

//        second q.
        String s1 = "Java Strings";
        String s2 = "Techno Study";
//        Study Java
        String st = s2.substring(7);
//        System.out.println(st);
        String jv = s1.substring(0, 4);
//        System.out.println(jv);
        System.out.println(st + " " + jv);
    }
}
