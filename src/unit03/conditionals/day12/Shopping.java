package unit03.conditionals.day12;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
//        ask how many items to buy
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you want to buy?");
        int quantity = input.nextInt();
        int price = 25;
        int total;

        if(quantity>=5){
            price--;
        }
        total = quantity * price;
        System.out.println("Your total is: " + total);
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
