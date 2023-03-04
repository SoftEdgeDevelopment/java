package unit01.primitive.types.day02;

public class LiteralVsStringLiteral {
//difference between literal vs string literal
    public static void main(String[] args) {
        //numbers 5, and 7 created
        int num1 = 5;
        int num2 = 7;

        //5 + 7 = 12
        //12 will be printed to console
        System.out.println(num1 + num2);

        //Strings 5, and 7 are created
        String str1 = "5";
        String str2 = "7";

        //57 will be printed to console because "5""7" are text and not math
        System.out.println(str1+str2);
    }

}

