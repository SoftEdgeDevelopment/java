package unit03.conditionals.learning13;
//write an if else statement for parking fee rates when exceeding a certain amount of time
public class ParkingFee {
    public static void main(String[] args) {
//        parking fee
//        less than or equal to 2 hours parking: 30 dollars
//        hourly rate: 12 dollars
//        Note: Make it a function if there is time.
//        print out the invoice showing the price
        //new double for rate per hour $
        double rate = 12;
        //new double for amount of hours
        double hours = 5;
        //new double for the total price fee
        double fee;
        if(hours <= 2){
            //if less than or equal to 2 hours, fee is 30
            fee = 30;
            //tell user how much they owe
            System.out.println("you owe: $" + fee);
        }
        //else if the hours is more than 2
        else{
            //the fee is hours * rate
            fee = hours * rate;
            //tell user how much they owe
            System.out.println("you owe: $" + fee);
        }
    }
}
