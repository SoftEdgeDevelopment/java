package javaprojects.project04;

import java.util.Scanner;
// output how many candy bars and gumballs you can get if you spend
//all of your coupons on candy bars first, and any remaining coupons on gumballs.
public class Assignment02{
    public static void main(String[] args) {

        // create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter number of coupons
        System.out.print("Enter number of coupons: ");

        // read the user input for number of coupons
        int coupons = scanner.nextInt();

        // calculate the number of candy bars that can be bought with the coupons
        int candyBars = coupons / 10;

        // calculate the number of remaining coupons after buying candy bars
        int remainingCoupons = coupons % 10;

        // calculate the number of gumballs that can be bought with the remaining coupons
        int gumballs = remainingCoupons / 3;

        // if there are enough coupons for at least one candy bar
        if (candyBars > 0) {
            // display the number of candy bars that can be bought
            System.out.println("Number of Candies: " + candyBars);
        }

        // if there are enough coupons for at least one gumball
        if (gumballs > 0) {
            // display the number of gumballs that can be bought
            System.out.println("Number of Gumballs: " + gumballs);
        }

        // if there are not enough coupons for any redeem
        if (candyBars == 0 && gumballs == 0) {
            // display the message "Not enough coupons"
            System.out.println("Not enough coupons");
        }
    }
}