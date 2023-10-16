package unit09.inheritance.learning34.carpractice;

public class CarMain {
    public static void main(String[] args) {
        //new Taxi object created from the Taxi class with parameters from super() constructor
        Taxi taxi1 = new Taxi("Honda",12000,5);
        //call to the methods to display the information of the taxi
        System.out.println("The taxi is a " + taxi1.getMake() + " with " + taxi1.getNumberOfPassengers() + " seats");
    }
}
