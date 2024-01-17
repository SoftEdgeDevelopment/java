package unit11.collections.learning42.moresortinglistbycomparable;

public class Car implements Comparable<Car> {
    //private variables for car
    private int maxSpeed;
    private String make;


    //generate constructor
    public Car(String make, int maxSpeed) {
        this.make = make;
        this.maxSpeed = maxSpeed;
    }

    //generate override toString method
    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", maxSpeed=" + maxSpeed + '}';
    }

    //override method to compare the max speed
    @Override
    public int compareTo(Car that) {
        return this.maxSpeed - that.maxSpeed;
    }
}
