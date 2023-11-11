package unit09.inheritance.learning38.polymorphismpractice;

public class Mail {
    private double weight;

    //generate constructor
    public Mail(double weight) {
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
}
