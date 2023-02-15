package unit03.conditionals.day15;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(3,5);

        if(r1.equals(r2)) {
            System.out.println("They have same values");
        } else {
            System.out.println("They don't have the same values");
        }
    }
}
