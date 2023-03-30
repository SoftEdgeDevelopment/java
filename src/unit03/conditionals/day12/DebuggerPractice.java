package unit03.conditionals.day12;
//true or false practice with math values
public class DebuggerPractice {
    public static void main(String[] args) {
        //new inv variables
        int a = 5;
        int b = 7;
        int c = 3;
        //new boolean variable to test if a is greater than b
        boolean test = a > b;
        System.out.println(test);
        //c = 5 + 7 (12)
        c = b+a;
        //prints out 12 + 5 (17)
        System.out.println(c + a);
        //checks if 17 = 7 (false)
        System.out.println(c == b);
    }
}
