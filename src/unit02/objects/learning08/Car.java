package unit02.objects.learning08;
//new class for car
public class Car {
    //new private instance variables for color and mileage
    private String color;
    private double mileage;
    //generate constructor with parameters to assign new values
    public Car(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
    }
    //drive method void just update the mileage increase by 10 miles
    public void drive(){
        //display the car and initial information
        System.out.println("a " + color + " is at " + mileage + " miles");
        //will increase the mileage by 10 each time this method is initialized
        mileage += 10;
        System.out.println("after it drives 10 miles, the updated mileage is " + mileage);
    }
    //getMileage method nonvoid will return the mileage of the car
    public double getMileage(){
        //return the value mileage to getMileage after driving
        return mileage;
    }
}
