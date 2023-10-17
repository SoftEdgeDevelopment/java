package unit09.inheritance.learning35.superkeyword;

import java.util.ArrayList;

public class GoalKeeper extends SoccerPlayer{
    private int gloveSize;

    //generate super() constructor from SoccerPlayer
    public GoalKeeper(String name, String team, int jerseyNumber, int cleatSize, ArrayList<String> kickStyles, int gloveSize) {
        super(name, team, jerseyNumber, cleatSize, kickStyles);
        this.gloveSize = gloveSize;
    }

    public void goalKick(){
        System.out.println("The goalie is blocking a kick");
    }

    public void practice(){
        System.out.println("The goalie is practicing the saving styles");
        //the practice() method in SoccerPlayer also has super() will be sent first
        super.practice();
    }
}
