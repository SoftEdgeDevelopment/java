package unit13.datetime.api.learning48.datetimetopic.parsingformatting;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingCustomFormat {
    //parsing custom format styles for DateTimeFormatter
    public static void main(String[] args) {
        //create a new DateTimeFormatter
        DateTimeFormatter usStyle = DateTimeFormatter.ofPattern("MM.dd.uu");

        //create the date using LocalDate.now()
        LocalDate theDate = LocalDate.now();

        //create a new DateTimeFormatter
        DateTimeFormatter aslanStyle = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        //display theDate using both formatter styles
        System.out.println(theDate.format(usStyle));
        System.out.println(theDate.format(aslanStyle));

        DateTimeFormatter displayStyle = DateTimeFormatter.ofPattern("d MMM uuu");
        System.out.println(theDate.format(displayStyle));
    }
}
