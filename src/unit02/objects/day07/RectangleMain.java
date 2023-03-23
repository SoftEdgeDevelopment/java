package unit02.objects.day07;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
//        rectangle1.printArea();
        Rectangle rectangle2 = new Rectangle(5,2);
        //new ints to get areas from rectangles
        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();
        //display the values of the areas of each rectangle
        rectangle1.printArea();
        rectangle2.printArea();
        //display the total value added of the areas of all rectangles
        System.out.println("The total area of rectangles is " + (area1 + area2));
    }
}
