package unit02.objects.learning09;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Programming with Java";
        //will display the index of the beginning of Java
       System.out.println(str1.indexOf("Java"));
       //will display -1 because it is not contained within the string
       System.out.println(str1.indexOf("java"));

        String str2 = "Hello Testers";
        //will print out the amount of characters contained in the string
        System.out.println(str2.length());
        //will print the start location of "lo" contained within the string
        System.out.println(str2.indexOf("lo"));
        //will print out -1 because this is not contained in the string
        System.out.println(str2.indexOf("ol"));
        //will print out the substring of the characters contained between the value index of 1 and 3 (will print the value of index 1 and 2)
        String elStr = str2.substring(1, 3);
        //will print out "el" - index 1 and 2
        System.out.println(elStr);
        //will print out "Tester" - index 1-11 (12 is not included because it is everything before 12)
        String result = str2.substring(6,12);
        //will print the result
        System.out.println(result);


    }
}
