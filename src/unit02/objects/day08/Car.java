package unit02.objects.day08;

public class Car {
//    color
    private String color;
//    mileage
    private double mileage;
//    constructor

    public Car(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
    }

//    drive method void just update the mileage increase by 10 miles
    public void drive(){
        mileage = mileage + 10;
    }
//    getMileage method nonvoid will return the mileage of the car
    public double getMileage(){
        return mileage;
    }
}
