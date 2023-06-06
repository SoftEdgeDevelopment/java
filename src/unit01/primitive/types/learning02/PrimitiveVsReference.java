package unit01.primitive.types.learning02;

public class PrimitiveVsReference {
//practice with primitive types
    public static void main(String[] args) {
        int year = 2022;
        String name = "John";
        //will print 2022
        System.out.println(year);
        //will print "John"
        System.out.println(name);
        //will print the length of "John" - 4 chars
        System.out.println(name.length());
        //will print the same year
        System.out.println(year++);
        //++ will be initialized after
        System.out.println(year);

    }


}
