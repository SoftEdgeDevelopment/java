package unit03.conditionals.day11;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    getArea method return double value
//    Formula A = PI*r*r
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

//    getPerimeter method
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
