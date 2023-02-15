package unit03.conditionals.day13;

public class ParkingFee {
    public static void main(String[] args) {
//        parking fee
//        less than or equal to 2 hours parking: 30 dollars
        double hours = 2;
//          else
        double total;
        if(hours <= 2){
            total = 30;
        } else {
            total = 12 * hours;
        }
        System.out.println("The parking fee is " + total);
//        hourly rate: 12 dollars
//        Note: Make it a function if there is time.
//        print out the invoice showing the price
    }
}
