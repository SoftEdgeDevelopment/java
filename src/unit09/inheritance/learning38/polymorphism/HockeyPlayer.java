package unit09.inheritance.learning38.polymorphism;

public class HockeyPlayer extends Athlete{

    //new super constructor
    public HockeyPlayer(String name) {
        super(name);
    }

    //override practice method from Athlete
    @Override
    public void practice() {
        super.practice();
    }

    public void shoot(){
        System.out.println("The player is shooting the puck");
    }

    public void pass(){
        System.out.println("The player is passing the puck");
    }
}
