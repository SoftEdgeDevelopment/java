package unit03.conditionals.day13;

public class IfExample {
    public static void main(String[] args) {
//        drinks
//        one drink is 3 dollars
        int numberOfDrinks = 10;
        double total;

        if (numberOfDrinks < 5) {
            total = 3 * numberOfDrinks;
        } else {
            total = 2.5 * numberOfDrinks;
        }
        System.out.println("Your total is " + total);
//        if you buy 5 or more 2.5 dollars per drink
//        print out the final price
//        one scenario 3 drinks
//        other scenario 7 drinks.

    }
}
