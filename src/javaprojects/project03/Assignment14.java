package javaprojects.project03;

//extract specific from a String and display the result
import java.util.Scanner;
//Ask user the enter the product name (String, multiple words)
//Ask user to enter the price (double)
//Ask user to enter the quantity(int)
//Ask user to enter their full name (String, multiple word)
//Print in the following format:
// "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
public class Assignment14 {
    public static void main(String[] args) {
        // create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // prompt user and get user input for product name
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        // prompt user and get user input for price
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        // prompt user and get user input for quantity
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        // consume the new line character left over by nextInt() otherwise error will occur
        scanner.nextLine();
        // prompt user and get user input for their full name, first + last
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();
        // calculate total cost
        double totalCost = price * quantity;
        // extract first name from full name (assuming first word is the first name)
        //get the index location of the space to separate the first and last name
        int spaceIndex = fullName.indexOf(" ");
        //substring with 0 index starting and space index as ending to get the first name
        String firstName = fullName.substring(0, spaceIndex);
        // print the order summary
        System.out.println(firstName + ", your order for " + quantity + " " + productName + " has been placed. Your total is $" + totalCost + ".");
    }

}
