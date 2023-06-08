package unit05.classes.oop.learning21.gettersandsetters;
//class created with getters to call from the main and setters to change the values of parameters of the object in the main, override to string and display all the information
//new private variables for color, address, and price
public class House {
    private String color;
    private String address;
    private double price;

    //generate constructor with parameters to assign variables
    public House(String color, String address, double price) {
        this.color = color;
        this.address = address;
        this.price = price;
    }
    //generate getters and setters to get and set the info of the object in the main
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //generate override to string method
    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
    //create main method to display the house information
    public static void main(String[] args) {
        //create new house object
        House house1 = new House("Red","148th east road",150000);
        //display the house info
        System.out.println(house1);
        house1.setAddress("west street 42nd way");
        //get the house color
        house1.getColor();
        //set the color of the house
        house1.setColor("Pink");
        //display the updated house
        System.out.println(house1);
    }
}
