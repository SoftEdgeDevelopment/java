package unit09.inheritance.learning36.creditcardpractice;

public class CreditCard {
    private double balance;

    //constructor
    public CreditCard(double balance) {
        this.balance = balance;
    }

    //constructor with no parameters, balance assigned value
    public CreditCard(){
        balance = 0;
    }

    //transaction method
    public void transaction(double amount){
        balance += amount;
    }

    //method to display balance info
    public void info(){
        System.out.println("Your balance: " + balance);
    }
}
