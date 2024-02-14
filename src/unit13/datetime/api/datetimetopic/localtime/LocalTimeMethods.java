package unit13.datetime.api.datetimetopic.localtime;

import java.time.LocalTime;

public class LocalTimeMethods {
    public static void main(String[] args) {
        //localtime methods to display info about the time
        //use LocalTime.now() to display the time right now
        LocalTime time = LocalTime.now();
        System.out.println("The time right now is " + time);

        //use LocalTime.of() to display what time an event occurs
        LocalTime openingHourOfDunkinDonuts = LocalTime.of(6,0);
        System.out.println("Dunkin Donuts opens at " + openingHourOfDunkinDonuts + " in the morning");

        //use .getHour() to display the hour number
        System.out.println("Dunkin Donuts opens at the hour of " + openingHourOfDunkinDonuts.getHour());

        //modify time methods
        //to display the targeted time
        System.out.println("I will go to Panera Bread 4 hours after i visit Dunkin Donuts at " + openingHourOfDunkinDonuts.plusHours(4));

        //isAfter(), isBefore(), isEqual()
        LocalTime starbucksOpeningHour = LocalTime.of(5,30);
        System.out.println("Starbucks opens after Dunkin Donuts -> " + starbucksOpeningHour.isAfter(openingHourOfDunkinDonuts));
    }
}
