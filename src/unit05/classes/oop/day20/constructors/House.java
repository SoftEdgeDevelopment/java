package unit05.classes.oop.day20.constructors;

public class House {
    private String color;
    private String address;
    private double price;
    private boolean isRental;

    public House() {
        color = "Yellow";
        address = "NY, New York";
        price = 500000.00;
        isRental = false;
    }

    public House(String color, String address, double price, boolean isRental) {
        this.color = color;
        this.address = address;
        this.price = price;
        this.isRental = isRental;
    }

    @Override
    public String toString() {
        return "HouseObject=>{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", isRental=" + isRental +
                '}';
    }

    /*
    * Create a House Class
    * With instance variables for
    * Color
    * Address
    * Price
    * isRental
    * Create a Default constructor with no parameters, you decided about the values
    * Create a constructor with all parameters
    * Use IntelliJ to generate the constructors
    * Generate toString method as well*/
}
