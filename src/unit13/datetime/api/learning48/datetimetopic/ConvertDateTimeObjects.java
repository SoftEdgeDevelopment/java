package unit13.datetime.api.learning48.datetimetopic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ConvertDateTimeObjects {
    //convert LocalDate and LocalTime to LocalDateTime
    public static void main(String[] args) {
        //LocalDate for birthday using LocalDate,of to display birthday
        LocalDate birthday = LocalDate.of(2001,5,13);
        System.out.println("birthday is " + birthday);

        //from LocalDate to LocalDateTime
        LocalDateTime birthdayWithTime = birthday.atTime(3,47);
        System.out.println("birthday and time is "+birthdayWithTime);

        //LocalTime using LocalTime.of to display opening hour
        LocalTime openingHour = LocalTime.of(7,0);
        System.out.println("The shop opens at " + openingHour);

        //from LocalTime to LocalDateTime
        LocalDateTime openingin2024 = openingHour.atDate(LocalDate.of(2024,Month.APRIL,25));
        System.out.println("The shop opens at " + openingin2024);

        //from LocalDateTime to LocalDate using toLocalDate()
        LocalDate birthDate = birthdayWithTime.toLocalDate();
        System.out.println("Birth Date is " + birthDate);

        //from LocalDateTime to LocalTime using toLocalTime()
        LocalTime birthTime = birthdayWithTime.toLocalTime();
        System.out.println("Birth Time is " + birthTime);
    }
}
