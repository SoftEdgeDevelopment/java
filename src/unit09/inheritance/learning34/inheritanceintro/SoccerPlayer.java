package unit09.inheritance.learning34.inheritanceintro;

import java.util.ArrayList;

//inheritance from the Athlete class
public class SoccerPlayer extends Athlete{
    private int cleatSize;
    private ArrayList<String> kickStyles;

    //constructor
    public SoccerPlayer() {
        cleatSize = 9;
        kickStyles = new ArrayList<>();
        kickStyles.add("Trivela Kick");
        kickStyles.add("Corner Kick");
        kickStyles.add("Toe Kick");
    }

    //void method to display when there is a free kick
    public void freeKick() {
        System.out.println("The player is taking a free kick");
    }
}

