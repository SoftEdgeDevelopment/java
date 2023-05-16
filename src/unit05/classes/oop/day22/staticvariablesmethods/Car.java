package unit05.classes.oop.day22.staticvariablesmethods;

//showing the different between static(local) and instance variables with constructor and getter
public class Car {
    //create private instance variables to be assigned values
    private String model;
    private double mileage;
    private int year;

    //create new static variable (can only be accessed within the class)
    //num of cars starting from 0 because no objects were created yet
    private static int numOfCars = 0;
    //generate constructor with parameters to assign values to variables
    public Car(String model, double mileage, int year) {
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        //increase the number of cars after a new car object is created with the parameters
        numOfCars++;
    }
    //generate new getter method to get the NumOfCars
    public static int getNumOfCars() {
        //static methods are not able to reach instance variables of the class because everything in here is a local variable
        //this.mileage = 200;     will not work because it is an instance variable
        return numOfCars;
    }

    //generate override to string method to display all the information
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }
    //create main method to run the code
    public static void main(String[] args) {
        //create new car objects
        Car car1 = new Car("Honda",158298,1998);
        //display the count for number of cars calling to the static variable
        System.out.println(numOfCars);
        //display the information of car1
        System.out.println(car1);
        Car car2 = new Car("Chrysler",148121,2004);
        System.out.println(numOfCars);
        System.out.println(car2);
        Car car3 = new Car("Toyota",294914,1986);
        System.out.println(numOfCars);
        System.out.println(car3);
    }
}


