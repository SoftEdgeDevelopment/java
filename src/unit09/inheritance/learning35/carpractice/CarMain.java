package unit09.inheritance.learning35.carpractice;


//practice calling methods from superclass and subclasses
public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();

        ElectricVehicle tesla1 = new ElectricVehicle();

        SportsCar ferrari1 = new SportsCar(235);

        //calling to the Car drive method
        System.out.println(car1.drive());
        //calling to the SportsCar drive method
        System.out.println(ferrari1.drive());

        //call to the electric vehicle method to fill the battery
        System.out.println(tesla1.fill());
        //calls to the Car drive method
        System.out.println(tesla1.drive());

    }
}
