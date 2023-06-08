package unit03.conditionals.learning11;

public class Car {
    //new private variable for color
    private String color;

    //generate constructor with new parameter and assign to private variable
    public Car(String color) {
        this.color = color;
    }

    //override to write data as String
    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' + '}';
    }
}
