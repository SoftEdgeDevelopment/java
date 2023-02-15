package unit03.conditionals.day11;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        double area;
        area = circle1.getArea();
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + circle1.getPerimeter());
    }
}
