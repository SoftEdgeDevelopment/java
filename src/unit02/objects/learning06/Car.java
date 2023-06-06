package unit02.objects.learning06;
//new class created for Car
public class Car {


    //new private variables  for string color and double mileage
    private String color;
    private double mileage;

    //generate constructor
    public Car(String theColor, double theMileage) {
        this.color = theColor;
        this.mileage = theMileage;
        System.out.println("new object with 2 parameters created");
    }
    //practice with constructor overloading
    //creating a new constructor with only 1 parameter and 1 assigned value
    public Car(String theColor){
        color = theColor;
        mileage = 0;
        System.out.println("new object with 1 parameter created");
    }
    //new constructor with no parameters and assigned values
    public Car(){
        color = "Orange";
        mileage = 0;
    }
    //create new public void method to display messages about the car information
    public void carInfo(){
        System.out.println("The cars color is " + color);
        System.out.println("The car drove " + mileage + " miles");
    }

}
