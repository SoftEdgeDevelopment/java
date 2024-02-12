package unit12.exceptions.learning47.customexception;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

//    public void withdraw(double amount) {
//        if (amount > balance) {
//            System.out.println("Not enough funds available");
//        } else {
//            balance -= amount;
//            System.out.println("Withdraw : $" + amount + ", Remaining Balance : $");
//        }
//    }

//    public void withdraw(double amount){
//        //if the amount withdraw is more than the balance, throw an exception
//        if(amount > balance){
//            //RuntimeException is an unchecked exception, does not need try and catch
//            throw new RuntimeException();
//        }
//
//        balance -= amount;
//
//        System.out.println("Withdraw : $" + amount + ", Remaining Balance : $" + balance);
//    }

    public void withdraw(double amount) throws Exception {
        //if the amount withdraw is more than the balance, throw an exception
        if(amount > balance){
            //throw new exception and add to method
            //overload the exception by adding a custom message
            throw new InsufficientBalanceException("Withdraw fail, insufficient balance");
        }

        balance -= amount;

        System.out.println("Withdraw : $" + amount + ", Remaining Balance : $" + balance + " SUCCESSFUL");
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + '}';
    }
}
