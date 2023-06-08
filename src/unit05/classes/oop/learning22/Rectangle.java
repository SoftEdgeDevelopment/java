package unit05.classes.oop.learning22;

public class Rectangle {
    //methods that calculate the area of the rectangle, check if the rectangle is a square, and print out the information of the rectangle object
    //create new private instance variables
    private double width;
    private double height;
    //generate constructor with parameters to assign values to private variables
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //create override to string method
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    //new public method double to get the value of the area
    public double returnArea(){
        //new double variable = width * height
        double area = width*height;
        //returns the value of area to returnArea() method
        return area;
    }
    //method to check if the rectangle is a square
    //boolean method true or false
    public boolean isSquare(){
        return width == height;
        //----------------------------------------------
        //another way to write it
        //new boolean to check if the rectangle is even on all dimensions (square)
        //boolean square = width == height;
        //return true or false if it is a square to isSquare() method
        //return square;
        //----------------------------------------------
        //another other way to write with if statement
        //if (width == height){
        //    return true;
        //}else{
        //    return false;
        //}
    }
    //new method to calculate the area with parameters
    public double calculateArea(double w, double h){
        //return the values of width * height
        return w * h;
    }
    //new method to print the info of the rectangle
    public void printInfo(){
        //display the values of width and height assigned to the object in main
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        //call to the isSquare() method for true or false
        System.out.println("square : " + isSquare());
        //call to the returnArea() method to calculate width * height
        System.out.println("Area : " + returnArea());

    }
    //create main method to run the code
    public static void main(String[] args) {
        //create a new rectangle object from the Rectangle class and assign values to parameters for width and height
        Rectangle rectangle1 = new Rectangle(5,9);
        //display the rectangles information
        System.out.println(rectangle1);
        //display the rectangles area using returnArea method
        System.out.println("The area of the rectangle is : " + rectangle1.returnArea());
        //call to the isSquare() method to display if the rectangle is a square
        System.out.println("The rectangle is a square : " + rectangle1.isSquare());
        //call to the calculate area method and assign values to parameters
        System.out.println("The new rectangles area is " + rectangle1.calculateArea(5,5));
        //call to printInfo() void method to display all the information of the rectangle1 object
        rectangle1.printInfo();
    }
}
