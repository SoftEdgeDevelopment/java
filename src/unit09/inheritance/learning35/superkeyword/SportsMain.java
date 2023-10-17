package unit09.inheritance.learning35.superkeyword;

import java.util.ArrayList;
import java.util.Arrays;

//calling a superclass method to override subclass method
public class SportsMain {
    public static void main(String[] args) {
        //new array list for kickStyles
        ArrayList<String> kickStyles = new ArrayList<>(Arrays.asList("Bicycle Kick", "Corner Kick", "Scorpion Kick"));
        //new objects created from Superclass and Subclass
        Athlete athlete1 = new Athlete("john","USA",8);
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Mike", "Canada",32,8,kickStyles);
        //call to the freekick method from SoccerPlayer class
        soccerPlayer1.freeKick();
        //call to the super() method from SoccerPlayer class extending Athlete and super() method from GoalKeeper extending SoccerPlayer
        soccerPlayer1.practice();


        //make a new goalKeeper object
        GoalKeeper goalKeeper1 = new GoalKeeper("Joe","USA",14,8,kickStyles,5);

        //call to the override method inside of GoalKeeper
        goalKeeper1.practice();


    }
}
