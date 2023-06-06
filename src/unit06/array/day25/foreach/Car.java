package unit06.array.day25.foreach;

//create a class with private variables, constructors, and getters and setters, create a new array to hold objects, and display object info if the variable is more than a certain amount
public class Car {
    // private variable for storing the mileage of the car
    private int mileage;

    // constructor to assign a new value to the mileage variable
    public Car(int mileage) {
        this.mileage = mileage;
    }

    // getter method to retrieve the value of the mileage variable
    public int getMileage() {
        return mileage;
    }

    // setter method to set the value of the mileage variable
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // override the toString method to provide a string representation of the Car object
    @Override
    public String toString() {
        return "Car{" + "mileage=" + mileage + '}';
    }

    public static void main(String[] args) {
        // create a new Car objects and assign a value to the mileage
        Car car1 = new Car(123);
        Car car2 = new Car(45234675);
        Car car3 = new Car(7567456);

        // create a new array called cars to hold the Car objects
        Car[] cars = {car1, car2, car3};
        //foreach car element in the Car object, cars array
        for (Car car : cars) {
            //display the car if mileage is more than 50000
            //car.mileage works as well
            if(car.getMileage() >= 50000){
                System.out.println(car);
            }
        }

    }
}
