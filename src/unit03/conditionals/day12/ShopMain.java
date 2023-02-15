package unit03.conditionals.day12;

import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
        Shop today = new Shop();
        System.out.println("How many");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();

        int total = today.calculatePrice(quantity);
        System.out.println("Total is: " + total);
    }
}
