package unit11.collections.learning42.moresortinglistbycomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarMain {
    //different ways for sorting List using a class and implementing Comparable
    public static void main(String[] args) {
        //new List using Car class
        List<Car> carList = new ArrayList<>();
        //add cars manually
        carList.add(new Car("Honda", 190));
        carList.add(new Car("Kia", 120));
        carList.add(new Car("Porsche", 210));
        carList.add(new Car("Ford", 180));
        carList.add(new Car("Chevy", 165));

        System.out.println("Insertion Order: " + carList);

        //car is originally not a Comparator because it must be implemented in the Car class
        //sorts cars based on their speed from least to greatest
        carList.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: "+ carList);

        //sorts cars based on their speed from greatest to least
        carList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: "+carList);


    }
}
