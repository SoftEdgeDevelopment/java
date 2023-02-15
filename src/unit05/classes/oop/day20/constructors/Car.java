package unit05.classes.oop.day20.constructors;

public class Car {

    private String color;
    private int year;
    private double mileage;
    private boolean isAutomaticShift;

    public Car() {
        color= "Black";
        year = 2022;
        mileage = 0.0;
        isAutomaticShift = true;
    }

    public Car(String color, int year, double mileage, boolean isAutomaticShift) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.isAutomaticShift = isAutomaticShift;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' + ", year=" + year + ", mileage=" + mileage + ", isAutomaticShift=" + isAutomaticShift + '}';
    }


}
