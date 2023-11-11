package unit09.inheritance.learning38.polymorphismpractice;

import java.util.Objects;

public class Mail {
    private double weight;

    //generate constructor
    public Mail(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //new method to calculateShipping cost
    public double calculateShipping(){
        //weight *= 0.15;
        return weight * 0.15;
    }

    //override to string method
    @Override
    public String toString() {
        return "Mail{" +
                "weight=" + weight +
                '}';
    }

    //generate equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Double.compare(weight, mail.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
