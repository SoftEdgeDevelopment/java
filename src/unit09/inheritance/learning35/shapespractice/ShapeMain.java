package unit09.inheritance.learning35.shapespractice;

public class ShapeMain {
    public static void main(String[] args) {
        //call to the Super and Subclasses to create new objects
        Shape shape1 = new Shape();
        Circle circle1 = new Circle();
        Rectangle rectangle1 = new Rectangle();

        //call to the method from each subclass to display and override the message from the Shape Superclass

        System.out.println(shape1.printArea());
        System.out.println(circle1.printArea());
        System.out.println(rectangle1.printArea());
    }
}
