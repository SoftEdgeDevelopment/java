package unit03.conditionals.day15;

import java.util.Objects;

//new public class for rectangle
public class Rectangle {

    //new private variables for width and height
    private int width;
    private int height;

    //generate constructor to assign new parameters to private variables
    public Rectangle(int width, int height) {
        //new parameter from main assigned to width
        this.width = width;
        //new parameter from main assigned to height
        this.height = height;
    }

    //generate an equals method
    //right click - generate - equals - next - next
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
    //hashcode will be generated but dont need this
//    @Override
//    public int hashCode() {
//        return Objects.hash(width, height);
//    }
}
