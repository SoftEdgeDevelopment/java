package unit02.objects.learning08;
//new class for main method
public class RectangleMain {
    public static void main(String[] args) {
        //create new objects and assign parameters calling to Rectangle class constructor
        Rectangle rectangle1 = new Rectangle(3,8);
        Rectangle rectangle2 = new Rectangle(5,9);
        //new call to the display area method to display the area of each rectangle
        rectangle1.displayArea();
        rectangle2.displayArea();
        //create new ints too add the total of all areas
        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();
        //display the total of all areas
        System.out.println("The total of all areas is " + (area1 + area2));
    }
}
