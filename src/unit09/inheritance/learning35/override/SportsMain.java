package unit09.inheritance.learning35.override;

import java.util.ArrayList;
import java.util.List;


public class SportsMain {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("John", "USA", 22);

        //new array list with differnt types of kicks
        ArrayList<String> kicks = new ArrayList<>(List.of("Scorpion Kick", "Bicycle Kick", "Corner Kick"));

        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Kate S", "France", 34, 7,kicks);

        //call to the object getting parameters from subclasses and creating ArrayList<>, overriding methods from subclasses
        System.out.println(soccerPlayer1.getName() + " plays for team " + soccerPlayer1.getTeam() + " wearing jersey number " + soccerPlayer1.getJerseyNumber() +
                ", wearing cleat size " + soccerPlayer1.getCleatSize() + ", specializing in " + soccerPlayer1.getKickStyles());

        //call to the freeKick and practice methods
        soccerPlayer1.practice();
        soccerPlayer1.freeKick();

        //create new hockey player from the HockeyPlayer subclass
       HockeyPlayer hockeyPlayer1 = new HockeyPlayer("John", "Canada",23,9);
       //call to the hockey player methods to display hockey player passing and shooting
       hockeyPlayer1.pass();
       hockeyPlayer1.shoot();
       //will override and call to the practice method created in the HockeyPlayer subclass
       hockeyPlayer1.practice();
    }
}
