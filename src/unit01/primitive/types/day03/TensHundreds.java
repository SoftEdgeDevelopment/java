package unit01.primitive.types.day03;

public class TensHundreds {
    public static void main(String[] args) {
        //find the value of the tens and the ones digit
        //value is 54
        int number = 54;
        //the 10s number is 54 / 10 = 5 because int is whole number
        int tens = number / 10;
        //will print "The tens digit is 5"
        System.out.print("The tens digit is ");
        System.out.println(tens);

        //54 % 10 = 4 remainder to find the value of the ones digit
        int ones = number % 10;
        //will print "The ones digit is 4"
        System.out.print("The ones digit is ");
        System.out.println(ones);

    }
}
