package unit09.inheritance.learning36.creditcardpractice;


//practice overriding super() methods
public class CreditCardMain {
    public static void main(String[] args) {
        System.out.println("---Credit Card Transactions---");
        //object created from the no parameters constructor
        CreditCard creditCard = new CreditCard();
        //call to the info() method from the CreditCard class
        creditCard.info();
        //call to the transaction() method from CreditCard class
        creditCard.transaction(100);
        creditCard.transaction(20.50);
        creditCard.info();
        creditCard.transaction(13.37);
        creditCard.info();

        System.out.println(" ");
        System.out.println("---Reward Card Transactions---");
        //create a new object calling to the RewardCard subclass of CreditCard superclass
        RewardCard rewardCard = new RewardCard();
        rewardCard.info();
        rewardCard.transaction(100);
        rewardCard.transaction(20.50);
        rewardCard.info();
        rewardCard.transaction(13.37);
        rewardCard.info();

    }
}
