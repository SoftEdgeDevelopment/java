package unit03.conditionals.learning15;
//create a method to get the total cost of a shipment if quantity exceeds a certain amount
public class SaleAndShipmentQuestion {
    public static void main(String[] args) {
        //call to the getTotal method with 1 parameter for quantity
        System.out.println(getTotal(20));

    }
    //new public int method to get the value of the total price after discount
    //must be static to call from the main, assign 1 parameter from quantity to assign in the main
    public static int getTotal(int quantity){
        //new variables for the price of each item, the price of shipping, and the total amount owed at checkout after discounts
        int itemPrice = 20;
        int shipment = 7;
        //total starts at 0 because nothing was added to cart yet
        int total = 0;
        //if the amount is more than 15
        if (quantity > 15) {
            //discount of $2 on each item and no cost for shipping fee
            total = quantity * (itemPrice - 2);
            //else if the amount is more than 10 but less than 15
        } else if (quantity > 10) {
            //discount of 2$ on each item but still pay for shipping fee
            total = quantity * (itemPrice - 2) + shipment;
            //else if amount is less than 10
        } else if (quantity>0) {
            //pay the full price for quantity * item price, and the cost of shipping
            total = quantity * itemPrice + shipment;
        }
        //return the value of the total to getTotal method, after quantity is entered from the main
        return total;
    }
}
   /*int itemPrice = 20;
    int shipment = 7;
    int quantity;

    if quantity is more than 10, price will be reduced by 2 dollars.
    if quantity is more than 15, shipment will be free.

    Please write the if statements to calculate the final price.

    Extra: write a function with the signature below

    public int getTotal(int quantity)*/