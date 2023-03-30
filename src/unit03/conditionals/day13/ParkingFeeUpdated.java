package unit03.conditionals.day13;
//if, else if, else practice for parking fee if exceeding different amounts
public class ParkingFeeUpdated {
    public static void main(String[] args) {
        //        less than or equal to 2 hours 30 dollars fixed
        //        more than two hours lass than or equal to 4 hours hourly rate 13 dollars
        //        more than 4 hours rate will be 12 dollars (else)
        //new double for amount of hours
        double hours = 1;
        //new double for total
        double total;
        //if less than or equal to 2 hours
        if (hours <= 2) {
            //the total price is 30
            total = 30;
        }
        //else if hours are less than or equal to 4 hours but greater than 2 dollars
        else if (hours <= 4) {
            //total price is amount of hours * 13 dollars
            total = hours * 13;
        }
        //else the hours is greater than 4
        else {
            //the total price is hours * 12 dollars
            total = hours * 12;
        }
        //display the total price at the end for the user
        System.out.println("Your total is " + total);

    }

}
