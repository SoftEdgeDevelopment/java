package unit09.inheritance.learning38.objectclass;

import java.util.Objects;

public class SportShoe extends Shoe{
    private String sport;

    //generate super() constructor from Shoe superclass
    public SportShoe(double size, String color, String sport) {
        super(size, color);
        this.sport = sport;
    }

    //generate super() equals and hashcode method from Shoe superclass
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportShoe sportShoe = (SportShoe) o;
        return Objects.equals(sport, sportShoe.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport);
    }
}
