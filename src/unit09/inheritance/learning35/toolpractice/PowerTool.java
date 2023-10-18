package unit09.inheritance.learning35.toolpractice;

//subclass extending Tool
public class PowerTool extends Tool{
    private double amper;

    //generate super() constructor based on Tool
    public PowerTool(String name, String brand, double amper) {
        super(name, brand);
        this.amper = amper;
    }

    public double getAmper() {
        return amper;
    }

    public void setAmper(double amper) {
        this.amper = amper;
    }

    @Override
    public String toString() {
        return "PowerTool{" +
                "amper=" + amper +
                '}';
    }
}
