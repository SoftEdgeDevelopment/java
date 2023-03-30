package unit03.conditionals.day11;
//call an object to different methods from a different class to get the area and circumference of a circle
public class CircleMain {
    public static void main(String[] args) {
        //create new object from circle class and assign parameter to radius
        Circle circle1 = new Circle(2);
        //new variable for area of the circle
        double area;
        //call object circle1 to the getArea method to get the area of a circle
        area = circle1.getArea();
        //display the area after calling to getArea method from circle class
        System.out.println("The area is " + area);
        //display the circumference of a circle after calling to the getPerimeter method from circle class
        System.out.println("The perimeter is " + circle1.getPerimeter());
    }
}
