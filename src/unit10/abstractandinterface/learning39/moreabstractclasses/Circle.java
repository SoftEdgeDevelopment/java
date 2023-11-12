package unit10.abstractandinterface.learning39.moreabstractclasses;

public class Circle extends Shape{
    private double radius;

    //generate super() constructor
    public Circle(int xCoordinate, int yCoordinate, double radius) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }

    //override implement the methods
    @Override
    public double getArea() {
        //area for circle is πr2
        return Math.PI * radius * radius;
    }

}
