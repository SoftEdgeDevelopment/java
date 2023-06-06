package unit01.primitive.types.learning03;

public class DivideByZero {

    public static void main(String[] args) {
        //error example when dividing by zero
        //will print out to start
        System.out.println("Hi");
        int x = 5;
        int y = 7;
        //5/0 is not possible
        //system will print out an error if this is run
        System.out.println(x/(y-7));
        //this code will not run because the line above was an error
        System.out.println("Bye");
    }
}
