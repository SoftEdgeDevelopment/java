package unit05.classes.oop.day21.gettersandsetters;
//Car class created with getters to call from the main and setters to change the values of parameters of the object in the main
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
    //new method to change the color of the car
    public void setColor(String color){
        this.color = color;
    }
    //new method to set the year
    public void setYear(int year){
        this.year = year;
    }
    //new method to set the mileage
    public void setMileage(int mileage){
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
