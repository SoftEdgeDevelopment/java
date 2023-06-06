package unit02.objects.learning08;

public class CarMain {
    public static void main(String[] args) {
        //new object created with parameters assigned
        Car car1 = new Car("Blue", 230);
        //initialize drive method 3 times
        car1.drive();
        car1.drive();
        car1.drive();
        //display the total mileage calling to the getMileage method
        System.out.println("the cars updated total mileage after driving is " + car1.getMileage());
    }
}
