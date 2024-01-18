package unit11.collections.learning42.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOExample {
    //FIFO First In First Out example for Queue using LinkedList
    public static void main(String[] args) {
        //create new Integer Queue using LinkedList
        Queue<Integer> integerQueue = new LinkedList<>();

        //display the empty queue
        System.out.println("Empty Queue: "+integerQueue);

        //using offer to add things to the queue, using poll to remove things, using peak to see what's in the queue
        integerQueue.offer(34);
        integerQueue.offer(45);
        integerQueue.offer(111);
        System.out.println("With numbers offered into queue: " + integerQueue);

        //Peek will show which is the next to come in the queue
        System.out.println("Peek next in queue: " + integerQueue.peek());
        System.out.println("After the peek: " + integerQueue);

        //will remove the first element from the que (first in first out)
        //display which element was polled from the queue
        System.out.println("element "+ integerQueue.poll()+ " removed from the queue");
        //display the updated queue
        System.out.println("With a poll from the queue (removes the first element): "+integerQueue);
        integerQueue.poll();
        System.out.println("one more poll: " + integerQueue);
        //queue will be empty again
        integerQueue.poll();
        System.out.println("one more poll: " + integerQueue);






    }
}
