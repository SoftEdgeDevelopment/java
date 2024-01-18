package unit11.collections.learning42.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LIFOStackExample {
    //LIFO Last In First Out, the last element in is the first element out, push, pop, peek
    //LinkedList or ArrayDeque as LIFO aka Stack
    //push - addFirst
    //pop - removeFirst
    //peek - peekFirst
    public static void main(String[] args) {
        //Deque - double-ended queue

        //make integer deque using LinkedList
        Deque<Integer> integerStack = new LinkedList<>();

        //manually add elements into the deque
        integerStack.push(99);
        System.out.println(integerStack);
        integerStack.push(11);
        System.out.println(integerStack);
        integerStack.push(55);
        System.out.println(integerStack);
        integerStack.push(68);
        System.out.println(integerStack);

        //LIFO last in first out - the first index element will be removed
        integerStack.pop();
        System.out.println("Popped from the stack: " + integerStack);

        //peek from the deque - shows the next up element in the stack
        System.out.println("Peek from the stack: " + integerStack.peek());
        System.out.println(integerStack);
    }
}
