package unit04.iteration.day16;

public class InvestmentExample {
    public static void main(String[] args) {
        /*
        * You have $100 in the investment account. It will be added 30% each year.
        * After how many years, your money will be 10K.
          Use a while loop?
        * */
        double balance = 100.0;
        int years = 0;

        while (balance <= 10000) {
            balance = balance + balance * 0.3;
            years++;
            System.out.println("At the end of the year: " + years + " balance: " + balance);
        }

        System.out.println(years + " years passed to reach the balance of " + balance);
    }


}
