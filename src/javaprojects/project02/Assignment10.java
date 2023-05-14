package javaprojects.project02;

//analyze the code and explain how it works
class Car {   //new CLASS created for Car
    //new PRIVATE for color - String
    private String color;
    //new PRIVATE for string mileage - double
    private double mileage;
    //make constructor starting as PUBLIC and same name as class
    //create new parameters inside (here), in this case string for color, and double for mileage, to get values to give to the variables - (car,mileage)
    public Car (String carColor, double carMileage)
    //create method to store the values
    {
        //private String color = value of new parameter
        color = carColor;
        //private double mileage = value of new parameter
        mileage = carMileage;
    }
}
//create the main class as public
public class Assignment10 {
    public static void main(String[] args) {
        Car johnsCar = new Car("Red", 13456);
        //create Car object from Car class, and name variable johnsCar
        //Car johnsCar =
        //new car object created
        //new Car
        //give 2 parameters, for String and double pulled from Car class
        //("Red", 13456);
    }
}