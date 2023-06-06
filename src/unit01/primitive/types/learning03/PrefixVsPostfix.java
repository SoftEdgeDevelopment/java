package unit01.primitive.types.learning03;

public class PrefixVsPostfix {
    public static void main(String[] args) {
        //prefix vs postfix increment
        int x = 5;
        x++;
        //x = 6 because increment after x
        System.out.println(x);
        x = 5;
        ++x;
        //x = 6 because increment before x
        System.out.println(x);
        x = 5;
        //x = 5 because increment after x but inside ()
        System.out.println(x++);
        //value of increment added now x = 6
        System.out.println(x);
        x=5;
        //value of x = 6 because increment before x
        System.out.println(++x);
    }
}
