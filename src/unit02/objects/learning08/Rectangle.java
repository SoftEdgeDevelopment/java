package unit02.objects.learning08;
//new class for Rectangle
//variable in main method - local variable
//variable that is specific to the class - instance variable
public class Rectangle {
    //new private variables for width and height
    private int width;
    private int height;

    //generate constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //non void it will return something
    //void - it does not return anything, it handles the code / lines and comes back with no value
    //nonvoid getArea method to return a variable for area
    public int getArea(){
        //calculate the area and assign it to a variable
        //new variable for the area
        int area = width * height;
        //return the area value to getArea method
        return area;
    }
    //new void method to display the information of the rectangle after getting the area method
    public void displayArea(){
        System.out.println("The area of the rectangle is " + getArea());
    }
}
