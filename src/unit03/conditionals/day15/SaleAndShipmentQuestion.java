package unit03.conditionals.day15;

public class SaleAndShipmentQuestion {
    public static void main(String[] args) {

        System.out.println(getTotal(20));

    }

    public static int getTotal(int quantity){
        int itemPrice = 20;
        int shipment = 7;
        int total = 0;

        if (quantity > 15) {
            total = quantity * (itemPrice - 2);
        } else if (quantity > 10) {
            total = quantity * (itemPrice - 2) + shipment;
        } else if (quantity>0) {
            total = quantity * itemPrice + shipment;
        }

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