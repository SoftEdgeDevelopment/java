package unit02.objects.day07;

public class Rectangle {
//    Create a rectangle Class
//    height width
//    one constructor.
//    Create printArea() method width*height
//    1) declare variables
    private int width;
    private int height;
//    2) Declare constructor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

//    3) declare print area method
    public void printArea(){
        int area = width*height;
        System.out.print("The area is ");
        System.out.println(area);
    }

//    4) declare a getArea method which returns the integer area value
//    after it calculated the area.
    public int getArea(){
      int area = width*height;
      return area;
    }
}
