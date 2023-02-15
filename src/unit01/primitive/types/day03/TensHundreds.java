package unit01.primitive.types.day03;

public class TensHundreds {
    public static void main(String[] args) {
        int number = 54;
        int tens = number / 10;
        System.out.print("The tens digit is ");
        System.out.println(tens);

        int ones = number % 10;
        System.out.print("The ones digit is ");
        System.out.println(ones);

    }
}
