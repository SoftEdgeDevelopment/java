package unit02.objects.day07;

//main
public class CarMain {
    public static void main(String[] args) {
        //new object created with 2 parameters
        Car car1 = new Car("Blue", 0);
        Car car2 = new Car("Green",30);
        //will display the value of the car info override to string
        System.out.println(car1);
        //will call to the second constructor with 1 parameter
        car1.drive(30);
        //will call to the first constructor with no parameters
        car1.drive();
        //will call to the second constructor with 1 parameter
        car1.drive(50);
        //will call to the first constructor with no parameters for car2
        car2.drive();
    }
}
