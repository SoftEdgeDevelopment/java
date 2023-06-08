package unit03.conditionals.learning12;

import java.util.Scanner;
//prompt user for quantity and give price discount if exceeding a certain amount
public class Shopping {
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user for how many items they want to buy
        System.out.println("How many items do you want to buy?");
        //new int variable for user input quantity
        int quantity = input.nextInt();
        //new int variable for price 25
        int price = 25;
        //new int for total
        int total;
        //if quantity is more than or equal to 5, give 1 dollar discount on price
        if(quantity>=5){
            //price - 1
            price--;
        }
        //total = amount of item multiplied by price
        total = quantity * price;
        //display price based on user input for quantity
        System.out.println("Your total is: $" + total + " after buyiung " + quantity + " items");
//        each item is 25 dollars
//        if they buy 5 or more items, y0ou will reduce the price one dollar less
//        if (quantity >= 5) {
//            total = quantity * (price - 1);
//        }
//        if (quantity < 5) {
//            total = quantity * price;
//        }
//        print the total price.


    }
}
