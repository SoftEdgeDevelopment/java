package unit13.datetime.api.enumtopic;

public class Car {
    private String make;
    //normally make the color variable like this and assign colors
    //private String color;

    //create a private variable for the enum type
    private Color color;

    //create an enum type for Color instead
    public enum Color {
        //enum must be all CAPS, because the represent final constants that cannot be changed
        YELLOW, WHITE, RED, BLUE, MAROON, BLACK, GREEN, PURPLE
    }

    //generate constructor
    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //override toString method to display cars info
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }
}
