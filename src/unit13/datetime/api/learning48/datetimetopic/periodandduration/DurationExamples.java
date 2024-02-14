package unit13.datetime.api.learning48.datetimetopic.periodandduration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExamples {
    //example using Duration to measure the duration between times
    public static void main(String[] args) {
        Duration twoHours = Duration.ofHours(2);
        System.out.println("Duration of 2 hours -> " + twoHours);
        System.out.println("Duration of 2 hours in minutes -> " + twoHours.toMinutes());

        Duration duration = Duration.ofSeconds(7260); //2 hours and 1 minute
        System.out.println("Duration of time -> " + duration);

        LocalDateTime startDateTime = LocalDateTime.of(2023, 4, 1, 10, 0);
        LocalDateTime endDateTime = LocalDateTime.now(); //Assuming now is after the startDateTime
        Duration durationBetween = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration between startDateTime and now -> " + durationBetween.toHours() + " hours");
    }
}
