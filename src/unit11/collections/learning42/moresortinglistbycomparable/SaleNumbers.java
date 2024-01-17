package unit11.collections.learning42.moresortinglistbycomparable;

public class SaleNumbers {
    private int numberOfSoldItems;
    private double revenue;

    //generate constructor
    public SaleNumbers(int numberOfSoldItems, double revenue) {
        this.numberOfSoldItems = numberOfSoldItems;
        this.revenue = revenue;
    }

    //generate getters

    public int getNumberOfSoldItems() {
        return numberOfSoldItems;
    }

    public double getRevenue() {
        return revenue;
    }

    //generate override toString method

    @Override
    public String toString() {
        return "SaleNumbers{" +
                "numberOfSoldItems=" + numberOfSoldItems +
                ", revenue=" + revenue +
                '}';
    }
}
