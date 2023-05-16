package unit05.classes.oop.day22.multipleclasses;
//student class created with private instance variables for name, gpa, and address using the address class,  constructor and getters and setters to send to the main
public class Student {
    //create new private instance variables
    private String name;
    private double gpa;
    //call to the address class for assigning address to Student class
    private Address address;

    //generate constructor with parameters to assign values to private instance variables
    public Student(String name, double gpa, Address address) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
    }

    //generate getters and setters to get and set the values of the variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //check if the given address is in the same state, getting address from Address object
    public boolean isSameState(Address otherAddress){
        //new string to get the states from both inputs
        //gets address object from outside and checks if it is the same as the address given object
        String myState = address.getState();
        String otherState = otherAddress.getState();
        //checks if the states are the same
        return myState.equals(otherState);
    }


    //generate override to string method to display all the information of the address
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", address=" + address +
                '}';
    }
}
