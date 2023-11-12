package unit10.abstractandinterface.learning39.moreabstractclasses;

//abstract class for shape
public abstract class Shape {
    private int xCoordinate;
    private int yCoordinate;

    //constructor
    public Shape(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //getter methods
    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    //abstract methods to get the area and to draw the shape
    public abstract double getArea();

    //move method to assign values of x and y coordinates
    public void moveTo(int newXCoordinate, int newYCoordinate){
        this.xCoordinate = newXCoordinate;
        this.yCoordinate = newYCoordinate;
    }

    //void method to draw the shape
    public void draw() {
        System.out.println("The " + this.getClass().getSimpleName() +
                " is drawn at the coordinates of (" + getxCoordinate() + ", " + getyCoordinate() +
                ") with the area of " + getArea());
    }

}
