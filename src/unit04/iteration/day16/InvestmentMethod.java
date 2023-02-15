package unit04.iteration.day16;

public class InvestmentMethod {
    public static void main(String[] args) {

        int requiredYears = getYearsToReachTheGoal(1000,0.3,10000);
        System.out.println(requiredYears + " years passed to reach 100000");

    }

    public static int getYearsToReachTheGoal(double balance, double rate, double targetBalance){
        int years = 0;

        while (balance < targetBalance) {
            balance = balance + balance * rate;
            years++;
            System.out.println("At the end of the year: " + years + " balance: " + balance);
        }

        return years;
    }
}
