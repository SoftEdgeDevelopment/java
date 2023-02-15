package unit04.iteration.day18;

public class NestedMadeUpQuestion {
    public static void main(String[] args) {
        for (int outer = 0; outer < 3; outer++) {
            System.out.print(outer + "-> ");
            for (int inner = 0; inner < 4; inner++) {
                System.out.print(inner);
            }
            System.out.println();
        }
    }
}
