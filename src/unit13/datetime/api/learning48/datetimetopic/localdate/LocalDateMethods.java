package unit13.datetime.api.learning48.datetimetopic.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateMethods {
    //localdate methods example to display realtime dates
    public static void main(String[] args) {
        //use LocalDate.now() to display the local date
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        //using LocalDate.of to display the date
        LocalDate birthDayJohnDoe = LocalDate.of(1995, 4, 27);
        System.out.println("John Doe was born " + birthDayJohnDoe);
        LocalDate birthDayMike = LocalDate.of(1995, Month.APRIL, 27);
        System.out.println("Mike was born " + birthDayJohnDoe);
        //use getYear to display the year of LocalDate
        System.out.println("John Doe was born in the year of " + birthDayJohnDoe.getYear());
        //use getDayOfWeek to display the name of the DAY on the date
        System.out.println("John Doe was born on the day of " + birthDayJohnDoe.getDayOfWeek());
        System.out.println("John Doe was born on day " + birthDayJohnDoe.getDayOfYear() + " of the year");

        //use to get for different languages
        System.out.println("John Doe was born in the day of " + birthDayJohnDoe.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("TR")));
        System.out.println("John Doe was born in the day of " + birthDayJohnDoe.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("AR")));

        //modify methods
        System.out.println("Three weeks after John was born is " + birthDayJohnDoe.plusWeeks(3));
        System.out.println("One year before John was born is " + birthDayJohnDoe.minusYears(1));

        //modify with with() using TemporalAdjusters
        System.out.println("First day of the month John was born " + birthDayJohnDoe.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("First day of the next month after John was born " + birthDayJohnDoe.with(TemporalAdjusters.firstDayOfNextMonth()));

        //get using ChronoUnit() for WEEKS
        System.out.println("Two weeks before John was born is " + birthDayJohnDoe.minus(2, ChronoUnit.WEEKS));

        //isLeapYear() to check if this year is a leap year
        System.out.println("is this year a leap year? " + LocalDate.now().isLeapYear());
        System.out.println("is next year a leap year? " + LocalDate.now().plusYears(1).isLeapYear());

        //isBefore(), isAfter(), isEqual()
        LocalDate birthdayJack = LocalDate.of(1980,6,12);
        System.out.println("Jack was born before john -> " + birthdayJack.isBefore(birthDayJohnDoe));


    }
}
