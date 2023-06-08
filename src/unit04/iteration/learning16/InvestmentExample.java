package unit04.iteration.learning16;
//do while loop to calculate amount of years taken to get a certain amount based on interest rate
public class InvestmentExample {
    public static void main(String[] args) {
        /*
        * You have $100 in the investment account. It will be added 30% each year.
        * After how many years, your money will be 10K.
          Use a while loop?
        * */
        //new variable for starting balance
        double balance = 100.0;
        //new variable for starting years
        int years = 0;
        //while balance is less than or equal to 10000, everything will keep reapeating
        while (balance <= 10000) {
            //add 30% to the balance yearly
            balance = balance + balance * 0.3;
            //years go up until balance is 10000
            years++;
            //display the value of the years and the total balance at the end of each year
            System.out.println("At the end of the year: " + years + " balance: " + balance);
        }
        //display the total end result of years and balance
        System.out.println(years + " years passed to reach the balance of " + balance);
    }


}
