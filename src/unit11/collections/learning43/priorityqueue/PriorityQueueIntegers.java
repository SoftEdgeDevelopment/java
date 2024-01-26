package unit11.collections.learning43.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueIntegers {
    //priority que example
    public static void main(String[] args) {
        //the first index will ALWAYS be the SMALLEST element
        //new queue using Integers
        Queue<Integer> priorityIntegers = new PriorityQueue<>();
        //offer new numbers to the queue
        priorityIntegers.offer(45);
        priorityIntegers.offer(13);
        priorityIntegers.offer(25);
        //to draw a line
        System.out.println("-".repeat(15));
        //display what has been offered into the queue
        System.out.println(priorityIntegers);
        //offer more to the queue
        priorityIntegers.offer(31);
        System.out.println("-".repeat(15));
        //display the updated queue
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        //poll from the queue
        System.out.println(priorityIntegers.poll());
        System.out.println("fist element poll, updated with the next smallest element");
        System.out.println("-".repeat(15));
        //display the updated queue with the new smallest element as the first index
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println("peek the next in queue");
        System.out.println(priorityIntegers.peek());
    }
}
