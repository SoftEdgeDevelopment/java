package unit13.datetime.api.enumtopic;

import java.util.ArrayList;
import java.util.List;

//enum example to represent final constants that cannot be changed and call them to the main in an object
public class CarMain {
    public static void main(String[] args) {
        //create a new car object calling to the Color constant to assign a color to the car
        Car car1 = new Car("Honda", Car.Color.BLACK);
        Car car2 = new Car("Toyota", Car.Color.WHITE);
        Car car3 = new Car("Mazda", Car.Color.YELLOW);
        Car car4 = new Car("Acura", Car.Color.BLUE);
        Car car5 = new Car("Ferrari", Car.Color.BLACK);

        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4, car5));

        System.out.println(cars);

        System.out.println("Black Cars: ");
        //foreach black car, display the car
        for (Car car : cars) {
            if (car.getColor() == Car.Color.BLACK) {
                System.out.println(car);
            }
        }

    }
}
