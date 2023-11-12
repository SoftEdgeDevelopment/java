package unit10.abstractandinterface.learning39.moreabstractclasses;

public class Rectangle extends Shape{
    private double width;
    private double height;

    //generate super() constructor
    public Rectangle(int xCoordinate, int yCoordinate, double width, double height) {
        super(xCoordinate, yCoordinate);
        this.width = width;
        this.height = height;
    }

    //override implement methods
    @Override
    public double getArea() {
        //width * height = area
        return width * height;
    }

}
