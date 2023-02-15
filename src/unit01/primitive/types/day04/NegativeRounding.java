package unit01.primitive.types.day04;

public class NegativeRounding {
    public static void main(String[] args) {
        double decimalNumber = -4.6;
        int roundedNumber;
        roundedNumber = (int)(decimalNumber - 0.5);
        System.out.println(roundedNumber);
    }
}
