package unit01.primitive.types.day04;

public class RoundingWithCasting {
    public static void main(String[] args) {
        //rounding positive numbers
        double x = 35.6;
        //new variable created equation for rounding positive number cast as int
        int roundedNumber;
        roundedNumber = (int)(x+0.5);
        //value will be 36 because 36.0 cast to int
        System.out.println(roundedNumber);
    }
}
