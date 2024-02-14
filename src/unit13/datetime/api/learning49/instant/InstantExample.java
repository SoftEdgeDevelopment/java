package unit13.datetime.api.learning49.instant;

import java.time.Instant;

public class InstantExample {
    //instant example to display time and date
    public static void main(String[] args) {
        //create a new instant for now to display the time and date now
        Instant now = Instant.now();
        System.out.println(now);

        //the amount of time that has passed (in seconds) for getEpochSecond
        System.out.println(now.getEpochSecond());

        //shows when the instant ofEpochSecond begins //use L for long
        System.out.println(Instant.ofEpochSecond(1707925145L));
    }
}
