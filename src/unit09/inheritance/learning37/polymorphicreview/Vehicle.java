package unit09.inheritance.learning37.polymorphicreview;


import java.util.ArrayList;
import java.util.List;

class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("green", 6);
        System.out.println(car.getClass().getSimpleName() + ": ");
        car.info();

        //create a new array list of vehicles with assigned parameters, List.of (can also use asList)
        ArrayList<Vehicle> vehicles = new ArrayList<>(List.of(new Vehicle("yellow"), new Car("red", 7), new Vehicle("Grey")));

        //add new Car object to the vehicles array list
        vehicles.add(new Car("Orange",3));
        for (Vehicle vehicle : vehicles) {
            //get the object Class name
            System.out.println(vehicle.getClass().getSimpleName() + ": ");
            //display each objects info
            vehicle.info();
        }
    }
}
//new class for vehicle
public class Vehicle {
    private String color;

    //constructor
    public Vehicle(String color) {
        this.color = color;
    }

    //public void method to display info
    public void info() {
        System.out.println(this.getClass().getSimpleName() + " is " + color);
    }


}

//new class for car extending vehicle
class Car extends Vehicle {
    private int numOfPassengers;

    //super() constructor
    public Car(String color, int numOfPassengers) {
        super(color);
        this.numOfPassengers = numOfPassengers;
    }

    //override info method
    @Override
    public void info() {
        super.info();
        //add additional information to the super() method to display for car
        System.out.println("It can fit " + numOfPassengers + " passengers");
    }
}
