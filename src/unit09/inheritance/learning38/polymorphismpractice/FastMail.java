package unit09.inheritance.learning38.polymorphismpractice;

public class FastMail extends Mail{
    //generate super constructor from Mail
    public FastMail(double weight) {
        super(weight);
    }
    //override calculateShipping method and add +5 to calculate shipping cost of fast mail


    @Override
    public double calculateShipping() {
        return super.calculateShipping() + 5;
    }

    //override to string as subclass
    @Override
    public String toString() {
        return "FastMail{weight="+ getWeight() +"}";
    }
}
