package unit03.conditionals.day15;

public class IfElseDilemma {
    public static void main(String[] args) {
        if (5 > 3) {
            System.out.println("It is true");
            if (4 > 7) System.out.println("it is true as well");
        } else System.out.println("it is false");
    }
}
