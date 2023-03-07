package unit01.primitive.types.day04;

public class NegativeRounding {
    public static void main(String[] args) {
        //rounding negative numbers
        //new variable decimal number
        double decimalNumber = -4.6;
        //new variable created for equation rounding negative number
        int roundedNumber;
        roundedNumber = (int)(decimalNumber - 0.5);
        // will print -5 because -4.6 rounded is -5
        System.out.println(roundedNumber);
    }
}
