package unit02.objects.day08;

public class Rectangle {
    //    width and height
    private int width;
    private int height;

    //    constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //    nonvoid getArea method
    public int getArea() {
//        calculate the area and assign
//        it to a variable
        int area;
        area = width * height;
//        return the area value
        return area;
    }
}
