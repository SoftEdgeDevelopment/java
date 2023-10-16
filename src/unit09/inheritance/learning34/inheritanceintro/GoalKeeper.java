package unit09.inheritance.learning34.inheritanceintro;

//inheritance from SoccerPlayer
public class GoalKeeper extends SoccerPlayer{
    private int gloveSize;


    //constructor
    public GoalKeeper(){
        gloveSize = 4;
    }

    //void method to display when there is a goal kick
    public void goalKick(){
        System.out.println("The goalie has encountered a kick");
    }
}