package unit09.inheritance.learning36.creditcardpractice;

//new subclass extending CreditCard superclass
public class RewardCard extends CreditCard{
    private double rewardRate;
    private double rewardBalance;


    //constructor with no parameters, private variables assigned values
    public RewardCard(){
        rewardBalance = 0;
        rewardRate = 0.1;
    }

    //super() constructor to get balance from CreditCard
    public RewardCard(double balance, double rewardRate, double rewardBalance) {
        super(balance);
        this.rewardRate = rewardRate;
        this.rewardBalance = rewardBalance;
    }

    //override the methods from CreditCard class
    @Override
    public void transaction(double amount) {
        super.transaction(amount);
        //function to increase reward balance accordingly
        rewardBalance += rewardRate * amount;
    }

    @Override
    public void info() {
        super.info();
        //add the information about the cashback amount
        System.out.println("Your cashback amount is: " + rewardBalance);
    }
}
