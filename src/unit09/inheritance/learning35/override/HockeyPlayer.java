package unit09.inheritance.learning35.override;


//new subclass extending Athlete superclass
public class HockeyPlayer extends Athlete {
    private int skateSize;

    //new super() constructor
    public HockeyPlayer(String name, String team, int jerseyNumber, int skateSize) {
        super(name, team, jerseyNumber);
        this.skateSize = skateSize;
    }

    //override practice() method from Athlete
    public void practice(){
        System.out.println("Hockey player is in practice session");
    }

    public void shoot(){
        System.out.println("Hockey Player is shooting the puck");
    }

    public void pass(){
        System.out.println("Hockey player is passing the puck");
    }

    public int getSkateSize() {
        return skateSize;
    }

    public void setSkateSize(int skateSize) {
        this.skateSize = skateSize;
    }

    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "skateSize=" + skateSize +
                '}';
    }
}
