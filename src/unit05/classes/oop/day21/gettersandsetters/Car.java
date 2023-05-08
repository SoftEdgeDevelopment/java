package unit05.classes.oop.day21.gettersandsetters;
//Car class created with getters to call from the main
public class Car {
    //create private variables for color, year, mileage
    private String color;
    private int year;
    private int mileage;


    //generate constructor with parameters
    public Car(String color, int year, int mileage) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    //create getter methods to get color, yea, and mileage information
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public int getMileage(){
        return mileage;
    }
    //create to string method
    //can change to write whatever you want to
    @Override
    public String toString() {
        return "It is a " + color + " Car with " + mileage + " mileage from the year of " + year;
    }
}
