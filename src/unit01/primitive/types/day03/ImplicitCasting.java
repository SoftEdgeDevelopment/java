package unit01.primitive.types.day03;

public class ImplicitCasting {
    public static void main(String[] args) {
        double num1 = 3.9;
        int num2 = 4 ;

//        num2 = (int)num1;

        num1 = num2;
        System.out.println(num1);
    }
}
