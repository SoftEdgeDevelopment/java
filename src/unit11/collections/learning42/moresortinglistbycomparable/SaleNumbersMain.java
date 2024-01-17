package unit11.collections.learning42.moresortinglistbycomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaleNumbersMain {
    //quick way to sort using Comparator.comparing with a class without having to implement
    public static void main(String[] args) {
        //new List using SaleNumbers class
        List<SaleNumbers> saleNumbersList = new ArrayList<>();

        //add each object manually
        saleNumbersList.add(new SaleNumbers(12,54.76));
        saleNumbersList.add(new SaleNumbers(58,1245.34));
        saleNumbersList.add(new SaleNumbers(30,600.12));
        saleNumbersList.add(new SaleNumbers(9,14.34));
        saleNumbersList.add(new SaleNumbers(76,2356));
        saleNumbersList.add(new SaleNumbers(6,132.98));

        //original (insertion) order
        System.out.println("Insertion Order: " + saleNumbersList);

        //order based on sold items from least to greatest
        saleNumbersList.sort(Comparator.comparing(SaleNumbers::getNumberOfSoldItems));
        System.out.println("Natural Order of Sold Items: " + saleNumbersList);

        //order based on revenue from least to greatest
        saleNumbersList.sort(Comparator.comparing(SaleNumbers::getRevenue));
        System.out.println("Natural Order of Revenue: " + saleNumbersList);


    }
}
