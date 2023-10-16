package unit09.inheritance.learning35.override;

public class Athlete {
    private String name;
    private String team;
    private int jerseyNumber;


    public Athlete(String name, String team, int jerseyNumber) {
        this.name = name;
        this.team = team;
        this.jerseyNumber = jerseyNumber;
    }

    //new method to call to, to display when the athlete is practicing
    public void practice(){
        System.out.println("The athlete is currently practicing");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
