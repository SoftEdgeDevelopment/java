package unit03.conditionals.day11;

public class MathPractice {
    //always initiate with (Math.typeOfOperation())
    public static void main(String[] args) {
        //abs - absolute value (7)
        System.out.println(Math.abs(-7));
        //power - 2 to the 3rd power, 2 * 2 * 2 = (8)
        System.out.println(Math.pow(2, 3));
        //sqrt - square root (2.0)
        System.out.println(Math.sqrt(4));
        //max - shows the greatest value (5)
        System.out.println(Math.max(5, 3));
        //max - shows the smallest value (3)
        System.out.println(Math.min(5, 3));
        //round - rounds the number to the nearest decimal
        //(3.0)
        System.out.println(Math.round(3.3));
        //(4.0)
        System.out.println(Math.round(3.7));
        //floor rounds the decimal down to 0 (3.0)
        System.out.println(Math.floor(3.7));
        //ceil raises the decimal up to 0 (4.0)
        System.out.println(Math.ceil(3.1));
        //PI - gives the value of pi
        System.out.println(Math.PI);
        //random - gives random value
        System.out.println(Math.random());
    }
}
