package unit05.classes.oop.learning22.multipleclasses;
//address class created with private instance variables for house street, city, state, and zip,  constructor and getters and setters to send to the main
public class Address {
    //new private instance variables to be accessed from anywhere
    private String houseStreet;
    private String city;
    private String state;
    private String zip;
    //generate constructor with parameters to assign values to private instance variables
    public Address(String houseStreet, String city, String state, String zip) {
        this.houseStreet = houseStreet;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    //new getters and setters
    public String getHouseStreet() {
        return houseStreet;
    }

    public void setHouseStreet(String houseStreet) {
        this.houseStreet = houseStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    //override to string method
    @Override
    public String toString() {
        return "Address{" +
                "houseStreet='" + houseStreet+ '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
