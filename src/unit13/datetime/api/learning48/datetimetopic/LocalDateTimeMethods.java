package unit13.datetime.api.learning48.datetimetopic;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public class LocalDateTimeMethods {
    public static void main(String[] args) {
        //create and access
        //LocalDateTime.now to display the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The Date and Time is " + now);

        LocalDateTime worldCupFinal2022 = LocalDateTime.of(2022,12,12,14,0);
        System.out.println("World Cup 2022 final was played at " + worldCupFinal2022);
        System.out.println("World Cup 2022 final was played on the day of " + worldCupFinal2022.getDayOfWeek());
    }
}
