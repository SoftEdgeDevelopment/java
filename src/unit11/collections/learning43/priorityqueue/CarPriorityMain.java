package unit11.collections.learning43.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarPriorityMain {
    public static void main(String[] args) {
        //create a PriorityQueue by Comparator, comparing the Car class getYear method
        Queue<Car> carsByYear
                = new PriorityQueue<>(Comparator.comparing(Car::getYear));
        carsByYear.offer(new Car("Honda", 2012));
        carsByYear.offer(new Car("Audi", 2019));
        carsByYear.offer(new Car("Ferrari", 2024));
        carsByYear.offer(new Car("BMW", 2007));
        carsByYear.offer(new Car("Ford", 2013));
        carsByYear.offer(new Car("Chevy", 2002));
        //grabs the first in PriorityQueue by lowest year
        System.out.println(carsByYear);
    }
}
