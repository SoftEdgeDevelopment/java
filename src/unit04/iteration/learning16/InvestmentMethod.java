package unit04.iteration.learning16;
//call to a different method using a while loop to get the target reached goal of years passed after investment
public class InvestmentMethod {
    public static void main(String[] args) {
        //call to the method with the parameters
        int requiredYears = getYearsToReachTheGoal(1000,0.3,10000);
        //display how many years it takes to reach
        System.out.println(requiredYears + " years passed to reach 100000");

    }
    //new method to check how many years it takes to reach the goal, poarameters for balance, rate, and target balance
    public static int getYearsToReachTheGoal(double balance, double rate, double targetBalance){
        //starting years is at 0
        int years = 0;
        //while the balance is less than the target balance
        while (balance < targetBalance) {
            //add the interest rate to the balance
            balance = balance + balance * rate;
            //increase the year by 1
            years++;
            //display at the end of each year what the balance is
            System.out.println("At the end of the year: " + years + " balance: " + balance);
        }
        //return the value of years to the method when the while loop ends
        return years;
    }
}
