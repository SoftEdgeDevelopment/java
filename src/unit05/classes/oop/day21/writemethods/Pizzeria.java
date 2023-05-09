package unit05.classes.oop.day21.writemethods;

import java.util.Scanner;
//class created with getters to call from the main and setters to change the values of parameters of the object in the main, override to string and display all the information
//method created for math to be called to the main
public class Pizzeria {
    //private variables for pizzeria information
    private String storeName;
    private double plainPrice;
    private double pepperoniPrice;
    private double veggiePrice;
    private double drinkPrice;

    //generate constructor with parameters to assign values to private variables
    public Pizzeria(String storeName, double plainPrice, double pepperoniPrice, double veggiePrice, double drinkPrice) {
        this.storeName = storeName;
        this.plainPrice = plainPrice;
        this.pepperoniPrice = pepperoniPrice;
        this.veggiePrice = veggiePrice;
        this.drinkPrice = drinkPrice;
    }

    //generate getter and setter methods to call and set the values of the variables in the main
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPlainPrice() {
        return plainPrice;
    }

    public void setPlainPrice(double plainPrice) {
        this.plainPrice = plainPrice;
    }

    public double getPepperoniPrice() {
        return pepperoniPrice;
    }

    public void setPepperoniPrice(double pepperoniPrice) {
        this.pepperoniPrice = pepperoniPrice;
    }

    public double getVeggiePrice() {
        return veggiePrice;
    }

    public void setVeggiePrice(double veggiePrice) {
        this.veggiePrice = veggiePrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
    //override to string method to display all the information
    @Override
    public String toString() {
        return "Pizzeria{" +
                "storeName='" + storeName + '\'' +
                ", plainPrice=" + plainPrice +
                ", pepperoniPrice=" + pepperoniPrice +
                ", veggiePrice=" + veggiePrice +
                ", drink=" + drinkPrice +
                '}';
    }
    //method to calculate plain pizza and drink order, get 2 parameters
    //first for the number of plain pizzas
    //second parameters for the number of drinks
    //will return the total price
    //new scanner for user input
    //2 parameters for number of plain and number of drinks
    public double priceForPlainAndDrink(double numOfPlain, int numOfDrink){
        //total equals
        double total = numOfPlain * plainPrice + numOfDrink * drinkPrice;
        //return the total
        return total;
    }

    //main method to run and call from
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //create new object and assign values to parameters
        Pizzeria pizzeria1 = new Pizzeria("PizzaJohns",15.25,17.5,13.5,2.40);
        //display the info of the pizzeria object
        System.out.println(pizzeria1);
        //prompt user to enter number of pizzas
        System.out.println("Enter the number of Plain Pizzas");
        //new variable for number of plain pizzas
        int numOfPlain = input.nextInt();
        //prompt user to enter number of drinks
        System.out.println("Enter the number of Drinks");
        //new variable for number of drinks
        int numOfDrink = input.nextInt();
        //new variable for total using users input and calling to the price method
        double total = pizzeria1.priceForPlainAndDrink(numOfPlain,numOfDrink);
        System.out.println("The total price for " + numOfPlain + " Plain Pizza and " + numOfDrink + " Drinks is $" + total);

    }
}
