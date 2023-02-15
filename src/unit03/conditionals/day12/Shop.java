package unit03.conditionals.day12;

public class Shop {
    private int price;

    public Shop() {
        this.price = 25;
    }

    public int calculatePrice(int quantity){
        price = 25;
        if(quantity>=5){
            price--;
        }
        return quantity*price;
    }
}
