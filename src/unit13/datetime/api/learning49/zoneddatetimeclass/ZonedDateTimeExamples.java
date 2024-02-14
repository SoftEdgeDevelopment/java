package unit13.datetime.api.learning49.zoneddatetimeclass;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExamples {
    //zoned date time examples to display information for different time zones
    public static void main(String[] args) {
        //use ZonedDateTime.now to get the date and time of the zone of user
        ZonedDateTime timeInSeattle = ZonedDateTime.now();
        System.out.println("The time in Seattle is " + timeInSeattle);

        //use .getOffset to display how much the time is offset by
        System.out.println("Time offset is " + timeInSeattle.getOffset());
        //use .getZone to get the time zone
        System.out.println("The time zone is " + timeInSeattle.getZone());

        //use .getAvailableZoneIds to display ALL zones
        System.out.println(ZoneId.getAvailableZoneIds());

        //get the time and date for a specific zone searching by ZoneID
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Paris")));

        //get the time difference
        ZonedDateTime seattleNextWeek = ZonedDateTime.of(2023,1,30,14,30,0,0,ZoneId.of("America/New_York"));
        System.out.println(seattleNextWeek);
        System.out.println(seattleNextWeek.withZoneSameInstant(ZoneId.of("Europe/Paris")));
    }
}
