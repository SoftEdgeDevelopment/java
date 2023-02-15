package unit02.objects.day10;

public class RevisitStringMethods {
    public static void main(String[] args) {
        String str1 = "California";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("for"));
        System.out.println(str1.indexOf("form"));
        System.out.println(str1.substring(2, 4));
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(str1.indexOf("n")));

    }
}
