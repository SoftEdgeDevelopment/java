package unit03.conditionals.learning11;

public class WrapperClasses {
    //gets an object value and wraps it into a class
    public static void main(String[] args) {

        int a = 7;
        //this primitive gets it as an object and autoboxes
        Integer b = 7;
        //the math will be handled with objects since it is wrapped and unboxed, normally wont work with objects
        System.out.println(a+b);
        //will display max value of int
        System.out.println(Integer.MAX_VALUE);
    }
}
