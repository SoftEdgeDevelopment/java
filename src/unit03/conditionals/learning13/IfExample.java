package unit03.conditionals.learning13;
//write an if else statement for price of drinks when exceeding a certain quantity
public class IfExample {
    public static void main(String[] args) {
//        drinks
//        one drink is 3 dollars
//        if you buy 5 or more 2.5 dollars per drink
//        print out the final price
//        one scenario 3 drinks
//        other scenario 7 drinks.
        //new int for number of drinks bought
        int numOfDrinks = 10;
        //new double for price of each drink
        double price = 3;
        //new double for total price paid
        double total;
        //if you buy 5 or more drinks
        if (numOfDrinks >= 5){
            //price is 2.50 each drink
            price = 2.5;
            //math for total price
            total = price * numOfDrinks;
            //display how much user owes
            System.out.println("you owe: $" + total);
        }
        //else if less than 5 drinks
        else{
            //each drink is 3
            //display how much user owes
            System.out.println("you owe: $" + (price*numOfDrinks));
        }


    }
}
