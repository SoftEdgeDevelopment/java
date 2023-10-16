package unit09.inheritance.learning34.carpractice;

public class Taxi extends Car{
    private int numberOfPassengers;

    //generate super constructor from Car class with parameters (constructor with no parameters MUST be created or superclass wont run)
    public Taxi(String make, double price, int numberOfPassengers) {
        super(make, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    //create a taxi class extended from car class
    //add int numberOfPassengers instance variable
    //create constructor using super() constructor with parameters from the superclass
}
