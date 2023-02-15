package unit02.objects.day08;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2, 3);
        int area1;
        area1 = rect1.getArea();
        System.out.println("The returned area is");
        System.out.println(area1);
    }
}
