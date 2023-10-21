package unit09.inheritance.learning38.polymorphism;

public class Athlete {
    private String name;

    //constructor
    public Athlete(String name) {
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //new void method to display when the Athlete is practicing
    public void practice(){
        System.out.println(this.getClass().getSimpleName() + " is practicing");
    }
}
