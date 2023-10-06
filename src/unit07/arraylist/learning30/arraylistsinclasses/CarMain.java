package unit07.arraylist.learning30.arraylistsinclasses;

import java.util.ArrayList;

//calling to multiple classes to create Objects and assign and display values from array lists

public class CarMain {
    public static void main(String[] args) {
        //new Car objects created from the Car class
        Car car1 = new Car("Honda", 1998,150000);
        Car car2 = new Car("Audi", 2003,123000);
        Car car3 = new Car("Mercedes", 2001,132000);
        //new CarDealer object created calling to the CarDealer class
        CarDealer dealer1 = new CarDealer("Mikes Autozone", "12345 Street, NY");
        //add cars to the dealer using the addCar() method
        dealer1.addCar(car1);
        dealer1.addCar(car2);
        dealer1.addCar(car3);
        //call to the carListPrint method to display all the cars information
        dealer1.carListPrint();
        dealer1.numberOfCars();
    }

}
class Car {
    private String make;
    private int year;
    private int mileage;

    public Car(String make, int year, int mileage) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
class CarDealer{
    private String dealerName;
    private String dealerAddress;
    private ArrayList<Car> cars;

    public CarDealer(String dealerName, String dealerAddress) {
        this.dealerName = dealerName;
        this.dealerAddress = dealerAddress;
        //assign a new empty array list to the cars to start
        this.cars = new ArrayList<>();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "carDealer{" +
                "dealerName='" + dealerName + '\'' +
                ", dealerAddress='" + dealerAddress + '\'' +
                ", cars=" + cars +
                '}';
    }
    //method to add a Car object into the cars array list
    public void addCar(Car car){
        cars.add(car);
    }

    //method to print the cars
    public void carListPrint() {
        //for each Car object in the cars array list
        for (Car car : cars) {
            //print the car
            System.out.println(car);
        }
    }

    //method to print the number of cars
    public void numberOfCars(){
        //count starting at 0
        int count = 0;
        //for each Car object in the cars array list
        for (Car car : cars) {
            //increase the count
            count++;
        }
        //return the value of the count to the method
        System.out.println(count + " cars in the dealership");
    }
}


