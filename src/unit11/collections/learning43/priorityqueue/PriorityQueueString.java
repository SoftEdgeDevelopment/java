package unit11.collections.learning43.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueString {
    public static void main(String[] args) {
        //first index will ALWAYS be the smallest letter in alphabetical order
        //new PriorityQueue using String Queue
        Queue<String> priorityString = new PriorityQueue<>();
        //offer strings to the queue
        priorityString.offer("Tokyo");
        priorityString.offer("Trabzon");
        priorityString.offer("New Youk");
        priorityString.offer("New Orleans");
        priorityString.offer("Orlando");
        priorityString.offer("Alabama");
        priorityString.offer("Virginia");
        //display the queue
        System.out.println(priorityString);
        System.out.println("-".repeat(15));
        System.out.println("poll from PriorityQueue");
        //poll from the queue
        System.out.println(priorityString.poll());
        System.out.println("-".repeat(15));
        System.out.println("peek next in PriorityQueue");
        //peek next in the queue
        System.out.println(priorityString.peek());
        System.out.println("-".repeat(15));
        System.out.println("poll from PriorityQueue");
        System.out.println(priorityString.poll());
        System.out.println("-".repeat(15));
        System.out.println("poll from PriorityQueue");
        System.out.println(priorityString.poll());
        System.out.println("-".repeat(15));
        System.out.println("peek next in PriorityQueue");
        System.out.println(priorityString.peek());
    }
}
