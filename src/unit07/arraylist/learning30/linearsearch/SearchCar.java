package unit07.arraylist.learning30.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

//method to search for index of an element object created from a different class

public class SearchCar {
    public static void main(String[] args) {
        //new Car objects created from the Car class
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Mazda");
        Car car4 = new Car("Audi");
        Car car5 = new Car("Mercedes");
        Car car6 = new Car("Jeep");
        Car car7 = new Car("Audi");
        //new array list to store all the cars
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5,car6));
        System.out.println(findCar(cars, "Honda"));
        //will only return the first found instance even if there are duplicates
        System.out.println(findCar(cars, "Audi"));
        //returns -1 when it is not found
        System.out.println(findCar(cars, "Ferrari"));
    }
    //new method to find the index of the car
    public static int findCar(ArrayList<Car> cars, String make){
        //go over each car in the cars array list
        for (int i = 0; i < cars.size(); i++) {
            //checks if the make and model of the car is the same
            if(cars.get(i).getModel().equals(make)){
                //return the index of the car
                return i;
            }
        }
        //else return -1 if the car is not found
        return -1;
    }
}
class Car{
    private String model;
    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

}
