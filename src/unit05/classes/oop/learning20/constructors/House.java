package unit05.classes.oop.learning20.constructors;
//create constructors with and without parameters, override to string and display the information of the house
public class House {
    //create house class with instance variables for color, address, price, is rented
    private String color;
    private String address;
    private double price;
    private boolean isRented;
    public House(){
        color = "red";
        address = "1234 Jackson Road";
        price = 365000;
        isRented = true;
    }
    //generate to string method for constructor with no parameters
    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", isRented=" + isRented +
                '}';
    }
    //create constructor with parameters for privates
    public House(String color, String address, double price, boolean isRented) {
        this.color = color;
        this.address = address;
        this.price = price;
        this.isRented = isRented;
    }
    //main method
    public static void main(String[] args) {
        //create objects for the first and second constructors and display the houses info
        House house1 = new House();
        System.out.println(house1);
        House house2 = new House("Orange", "8492 West Street", 515000, false);
        System.out.println(house2);
    }




}
