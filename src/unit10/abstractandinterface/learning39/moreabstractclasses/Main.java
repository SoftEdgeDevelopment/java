package unit10.abstractandinterface.learning39.moreabstractclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //practice creating abstract classes and objects calling override methods to the main

    public static void main(String[] args) {
        //new circle object calling to the Circle class
        Circle circle = new Circle(2, 4, 7);
        //calling to the override method to draw the circle
        circle.draw();

        Rectangle rectangle = new Rectangle(5, 9, 2.5, 3.7);
        rectangle.draw();
        System.out.println("---------------------------------");


        //create a new ArrayList for shapes using Shape class
        ArrayList<Shape> shapes = new ArrayList<>(List.of(circle, rectangle));

        //foreach shape in the shapes arraylist
        for (Shape shape : shapes) {
            //call to each override method to draw the shape
            shape.draw();
        }

    }
}
