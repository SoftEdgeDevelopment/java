package unit01.primitive.types.learning03;
//practice with casting
public class ImplicitCasting {

    public static void main(String[] args) {
        double num1 = 5.6;
        int num2 = 4 ;
        //num2 = 5.6
        num2 = (int)num1;
        num1 = num2;
        System.out.println(num1);
    }
}
