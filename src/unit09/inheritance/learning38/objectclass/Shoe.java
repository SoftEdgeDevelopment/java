package unit09.inheritance.learning38.objectclass;

import java.util.Objects;

public class Shoe {
    private double size;
    private String color;

    //generate constructor
    public Shoe(double size, String color) {
        this.size = size;
        this.color = color;
    }

    //generate equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return Double.compare(size, shoe.size) == 0 && Objects.equals(color, shoe.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }
}
