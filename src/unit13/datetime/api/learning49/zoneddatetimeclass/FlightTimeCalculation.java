package unit13.datetime.api.learning49.zoneddatetimeclass;

import java.time.*;

public class FlightTimeCalculation {
    //calculating the time between zones after a flight
    public static void main(String[] args) {
        // A flight from NY to Paris
        // Departure from NY is 2023 July 2 22:30
        // Flight duration is 8 hours
        // What is the arrival time in Paris, in Paris timezone

        // Use ZonedDateTime with LocalDateTime.of to get the timezone and departure time / date
        ZonedDateTime nyDeparture = ZonedDateTime.of(LocalDateTime.of(2023, Month.JULY, 2, 22, 30), ZoneId.of("America/New_York"));
        System.out.println("Depart from NY on " + nyDeparture);

        // Add flight duration to departure time
        ZonedDateTime nyArrival = nyDeparture.plusHours(8);

        // Convert NY arrival time to Paris timezone
        ZonedDateTime parisArrival = nyArrival.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("Arrive in Paris on " + parisArrival);



        //using Duration
//        // Use ZonedDateTime with LocalDateTime.of to get the timezone and departure time / date
//        ZonedDateTime nyDeparture = ZonedDateTime.of(LocalDateTime.of(2023, Month.JULY, 2, 22, 30), ZoneId.of("America/New_York"));
//        System.out.println("Depart from NY on " + nyDeparture);
//
//        // Define flight duration using Duration
//        Duration flightDuration = Duration.ofHours(8);
//
//        // Add flight duration to departure time
//        ZonedDateTime nyDeparturePlusDuration = nyDeparture.plus(flightDuration);
//
//        // Convert NY departure plus duration time to Paris timezone
//        ZonedDateTime parisArrival = nyDeparturePlusDuration.withZoneSameInstant(ZoneId.of("Europe/Paris"));
//        System.out.println("Arrive in Paris on " + parisArrival);
    }
}
