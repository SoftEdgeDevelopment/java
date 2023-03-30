package unit03.conditionals.day12;
//new class for Shop
public class Shop {
    //new private variable for price
    private int price;
    //generate constructor for private variable
    public Shop() {
        //set price value to 25
        this.price = 25;
    }
    //new method for calculating price with 1 parameter for quantity
    public int calculatePrice(int quantity){
        //price value is 25
        price = 25;
        //get the quantity value from user input in the main
        if(quantity>=5){
            //if more than 5, price is decreased by 1 for each
            price--;
        }
        //return the value of the quantity*price to calculatePrice
        return quantity*price;
    }
}
