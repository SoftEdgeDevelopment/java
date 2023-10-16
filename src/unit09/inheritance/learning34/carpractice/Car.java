package unit09.inheritance.learning34.carpractice;

public class Car {
    private String make;
    private double price;

    //constructor with no parameters (constructor with no parameters MUST be created)
    public Car(){
        make = "will be updated";
    }

    //constructor with parameters
    public Car(String make, double price) {
        this.make = make;
        this.price = price;
    }

    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //override to string method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                '}';
    }
}
