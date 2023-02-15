package unit03.conditionals.day15;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = new String("Java OOP");
        String str2 = new String("Java OOP");
        String str3 = str1;

        System.out.println(str1.equals(str2));
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);
        System.out.println(str2 == str1);
    }
}
