package unit01.primitive.types.learning03;

public class QuickReview {
    public static void main(String[] args) {
        //new int variable currentYear created
        int currentYear;
        //assigned 2022
        currentYear = 2022;
        //2022 printed
        System.out.println(currentYear);
        //value reassigned 2053
        currentYear = 2053;
        //2053 printed
        System.out.println(currentYear);

        //this will not work because currentYear is int
        //currentYear = 2.5;
        //final means the value will never change
        final double PI;
        PI = 3.14;
        //this will not work because PI is a final value
//        PI = 5;
        //new int variable = the remainder of the value after currentYear / 2      2053 / 2 = 1026 with 1 remainder
        int evenOrOdd = currentYear%2;
        //print 1
        System.out.println(evenOrOdd);

        //new int x = remainder of 4 / 2 = 0
        int x = 4%2;
        //prints 0
        System.out.println(x);
        //x = remainder of 5 / 2 = 1
        x = 5%2;
        //prints out math equation with PEMDAS
        //first 5%2 = 1
        //1 * 5 / 2 = 2.5 (2 because int)
        //2/3 = 0
        //5 + (2) = 7
        System.out.println(5-2/3+(5%2)*5/2);



    }
}
