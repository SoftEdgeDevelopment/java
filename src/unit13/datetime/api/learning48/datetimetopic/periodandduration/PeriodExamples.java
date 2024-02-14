package unit13.datetime.api.learning48.datetimetopic.periodandduration;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExamples {
    //example using Period to measure the period between times
    public static void main(String[] args) {
        Period twoMonths = Period.ofMonths(2);
        System.out.println("Period of 2 months -> "+twoMonths);
        System.out.println("Period of 2 months -> " + twoMonths.getMonths());

        Period time = Period.of(5,3,18);
        System.out.println("Period of time -> " + time);

        LocalDate johnBDay = LocalDate.of(1999,6,15);
        System.out.println("john is " + Period.between(johnBDay, LocalDate.now()).getYears() + " years old");
    }
}
