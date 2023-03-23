package unit02.objects.day07;

public class Rectangle {
    //Create a rectangle Class
    //height width
    //one constructor.
    //Create printArea() method width*height
    //1) declare variables
    private int width;
    private int height;
    //2) Declare constructor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //3) declare print area method
    public void printArea(){
            //will multiply parameters to get new int for area
        int area = width*height;
            //display the area
        System.out.println("The area of one rectangle is " + area);
    }
    //4) declare a getArea method which returns the integer area value
    // after it calculated the area.
    // new public int for returned value
    public int getArea(){
        //must both be int because it will return to original
       int area = width*height;
       //will return the value of area to getArea
       return area;
    }

}
