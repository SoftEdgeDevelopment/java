package unit05.classes.oop.day20.constructors;
//making constructor with no parameters, assigning variables, override to string, create object and call to main
public class Car {
    //new private variables for car info
    private String color;
    private int year;
    private double mileage;
    private boolean automaticTransmission;

    //constructor generated with no parameters
    public Car() {
        //set the values of private variables
        color = "Black";
        year = 1998;
        mileage = 137489;
        automaticTransmission = true;
    }
    //display car 1 and all the cars information
    //right click - generate - to string - select all
    //press shift x2 - search softwrap
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", automaticTransmission=" + automaticTransmission +
                '}';
    }
    //main method
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
    }
}
