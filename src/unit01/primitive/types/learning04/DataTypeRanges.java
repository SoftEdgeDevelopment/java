package unit01.primitive.types.learning04;

public class DataTypeRanges {

    public static void main(String[] args) {
        //data type max value min value ranges
        //will create a new byte variable - a and will equal to the max value of byte
        byte a = Byte.MAX_VALUE;
        //will print byte max value (127)
        System.out.println(a);
        //if added 1, the value will restart from the lowest point
        a++;
        //will byte value lowest (-128)
        System.out.println(a);
    }
}
