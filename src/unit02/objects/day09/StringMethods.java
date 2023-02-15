package unit02.objects.day09;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Programming with Java";
//        System.out.println(str1.indexOf("Java"));
//        System.out.println(str1.indexOf("java"));

        String str2 = "Hello Testers";
//        System.out.println(str2.length());

//        System.out.println(str2.indexOf("lo"));
//        System.out.println(str2.indexOf("ol"));
//
//        String elStr = str2.substring(1, 3);
//        System.out.println(elStr);
        String result = str2.substring(6,12);
        System.out.println(result);


    }
}
