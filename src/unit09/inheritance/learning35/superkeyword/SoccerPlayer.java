package unit09.inheritance.learning35.superkeyword;

import unit09.inheritance.learning35.override.Athlete;

import java.util.ArrayList;

//new subclass extending athlete superclass
public class SoccerPlayer extends Athlete {
    private int cleatSize;
    private ArrayList<String> kickStyles;

    //generate super() constructor
    public SoccerPlayer(String name, String team, int jerseyNumber, int cleatSize, ArrayList<String> kickStyles) {
        super(name, team, jerseyNumber);
        this.cleatSize = cleatSize;
        this.kickStyles = kickStyles;
    }

    public void practice(){
        //call to superclass for practice
        super.practice();
        //for each element in the kickStyles array list
        for (String kickStyle : kickStyles) {
            //display each kickStyle
            System.out.println("Practicing the " + kickStyle);
        }
    }

    //void method to display when the player is doing a free kick
    public void freeKick() {
        System.out.println("The player is doing a free kick");
    }

    //getters and setters
    public int getCleatSize() {
        return cleatSize;
    }

    public void setCleatSize(int cleatSize) {
        this.cleatSize = cleatSize;
    }

    public ArrayList<String> getKickStyles() {
        return kickStyles;
    }

    public void setKickStyles(ArrayList<String> kickStyles) {
        this.kickStyles = kickStyles;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "cleatSize=" + cleatSize + ", kickStyles=" + kickStyles + '}';
    }
}
