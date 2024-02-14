package unit13.datetime.api.learning48.datetimetopic.daysandmonths;

import java.time.DayOfWeek;
import java.time.Month;

public class DaysOfTheWeekAndMonthsExample {
    //day of the week and month enum example
    public static void main(String[] args) {
        //DayOfWeek to use the day of the week enum
        DayOfWeek today = DayOfWeek.THURSDAY;
        System.out.println("Today is " + today);

        //Month to use month enum
        Month thisMonth = Month.FEBRUARY;
        System.out.println("The month is " + thisMonth);
    }
}
