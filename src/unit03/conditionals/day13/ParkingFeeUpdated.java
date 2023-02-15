package unit03.conditionals.day13;

public class ParkingFeeUpdated {
    public static void main(String[] args) {
        double hours = 1;
        double total = 0.0;
//        less than or equal to 2 hours 30 dollarsfixed
//        more than two hours lass than or equal to 4 hours hourly rate 13 dollars
//        more than 4 hours rate will be 12 dollars (else)
        if (hours <= 2) {
            total = 30;
        } else if (hours <= 4) {
            total = hours * 13;
        } else {
            total = hours * 12;
        }

        System.out.println("Your total is " + total);

    }

}
