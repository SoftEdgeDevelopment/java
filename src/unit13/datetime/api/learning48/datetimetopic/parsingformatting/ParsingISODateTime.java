package unit13.datetime.api.learning48.datetimetopic.parsingformatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParsingISODateTime {
    //parsing a string to a LocalDate in ISO format
    public static void main(String[] args) {
        //new String for the date
        String stringDate = "2023-01-19";
        System.out.println("String Date -> " + stringDate);

        //use LocalDate.parse to parse a String to LocalDate format
        LocalDate parsedDate = LocalDate.parse(stringDate);
        System.out.println("Parsed Date -> "+parsedDate);
        System.out.println("Day of the month is -> "+parsedDate.getDayOfMonth());

        //new String for the time
        String stringTime ="17:35";
        System.out.println("String Time -> " + stringTime);

        //use LocalTime.parse to parse a String to LocalTime format
        LocalTime parsedTime = LocalTime.parse(stringTime);
        System.out.println("Parsed Time -> "+ parsedTime);

        //custom format needs DateTimeFormatter

    }
}
