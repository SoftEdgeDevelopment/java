package unit03.conditionals.day11;
//new Class Circle created
public class Circle {
    //new private variable for radius
    private double radius;
    //generate constructor for radius
    public Circle(double radius) {
        //new parameters assigned to radius
        this.radius = radius;
    }

//    getArea method return double value
//    Formula A = PI*r*r
    public double getArea(){
        //returns the value for the area of a circle
        return Math.PI*Math.pow(radius, 2);
    }

//    getPerimeter method
    public double getPerimeter(){
        //returns the value for circumference of a circle
        return 2*Math.PI*radius;
    }
}
