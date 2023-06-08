package unit03.conditionals.learning12;
//main method to get user input to display information from other classes using if statement
import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
        //new object created from Shop Class with no parameters assigned (price 25 assigned from shop class)
        Shop today = new Shop();
        //prompt user for how many items they bought
        System.out.println("How many did you buy?");
        //new scanner to get user input
        Scanner input = new Scanner(System.in);
        //get user input as an int variable
        int quantity = input.nextInt();
        //new int for total value from calculatePrice method in Shop class with quantity parameter
        int total = today.calculatePrice(quantity);
        System.out.println("Total is: " + total);
    }
}
