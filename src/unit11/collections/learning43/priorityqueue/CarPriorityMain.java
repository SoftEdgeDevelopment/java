package unit11.collections.learning43.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarPriorityMain {
    public static void main(String[] args) {
        //create a PriorityQueue by Comparator, comparing the Car class getYear method
        Queue<Car> carsByYear = new PriorityQueue<>(Comparator.comparing(Car::getYear));

    }
}
