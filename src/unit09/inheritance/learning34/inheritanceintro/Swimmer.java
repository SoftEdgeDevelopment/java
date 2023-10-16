package unit09.inheritance.learning34.inheritanceintro;

//inheritance from the Athlete class
public class Swimmer extends Athlete{
    private String swimStyle;

    public Swimmer(){
        swimStyle = "Freestyle";
    }

    public void dive(){
        System.out.println("The swimmer is diving");
    }

    public String getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(String swimStyle) {
        this.swimStyle = swimStyle;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "swimStyle='" + swimStyle + '\'' +
                '}';
    }
}
