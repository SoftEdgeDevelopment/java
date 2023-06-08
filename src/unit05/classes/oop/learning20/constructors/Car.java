package unit05.classes.oop.learning20.constructors;
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

    //right click - generate - constructor - select all
    public Car(String color, int year, double mileage, boolean automaticTransmission) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.automaticTransmission = automaticTransmission;
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
        //create object car1 using first constructor
        Car car1 = new Car();
        //display the info of car1 called from generating to string
        System.out.println(car1);
        //create object car2 using second constructor
        Car car2 = new Car("Yellow", 2010, 145000, true);
        //display the info of car2 from parameters assigned
        System.out.println(car2);
    }
}
