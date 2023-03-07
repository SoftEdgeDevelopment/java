package unit01.primitive.types.day03;

public class Casting {
    public static void main(String[] args) {
//practice with casting numbers
        int a = (int)5.5;
        //will print out 5 because 5.5 cast to int is a whole number - 5
        System.out.println(a);
        //will print out 2.5
        System.out.println(5.0/2);
        //will print out 2.5
        System.out.println(5/2.0);
        //will print out 2.5 because 5/2 whole numbers cast to double
        System.out.println((double)5/2);
        //will print out 2.5 because 5/2.0
        System.out.println(5/(double)2);
    }
}
