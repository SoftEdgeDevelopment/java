package unit02.objects.day07;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
//        rectangle1.printArea();
        Rectangle rectangle2 = new Rectangle(5,2);
        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();
        System.out.println("The total area of rectangles is ");
        System.out.println(area1 + area2);
    }
}
