package unit09.inheritance.learning34.inheritanceintro;

//inheritance from the Athlete class
public class HockeyPlayer extends Athlete{
    private int skateSize;
    public HockeyPlayer(){
        skateSize = 8;
    }

    public void shoot(){
        System.out.println("The hockey player is shooting the puck.");
    }

    public void pass(){
        System.out.println("The hockey player is passing the puck.");
    }
}
