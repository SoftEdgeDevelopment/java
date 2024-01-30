package unit11.collections.learning43.priorityqueuepractice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        //new PriorityQueue from Student class comparing by getAge
        Queue<Student> youngerFirst = new PriorityQueue<>(Comparator.comparing(Student::getAge));
        //new PriorityQueue from Student class comparing by getGPA reversed to get highest first in priority
        Queue<Student> higherGPAFirst = new PriorityQueue<>(Comparator.comparing(Student::getGPA).reversed());
        //offer new students to queue
        youngerFirst.offer(new Student(15, 3.7));
        youngerFirst.offer(new Student(19, 2.1));
        youngerFirst.offer(new Student(13, 4.0));
        youngerFirst.offer(new Student(12, 3.8));
        youngerFirst.offer(new Student(20, 3.2));
        youngerFirst.offer(new Student(11, 3.1));
        //displays priorityqueue based on getAge
        System.out.println("Youngest First: " + youngerFirst);

        higherGPAFirst.offer(new Student(15, 3.7));
        higherGPAFirst.offer(new Student(19, 2.1));
        higherGPAFirst.offer(new Student(13, 4.0));
        higherGPAFirst.offer(new Student(12, 3.8));
        higherGPAFirst.offer(new Student(20, 3.2));
        higherGPAFirst.offer(new Student(11, 3.1));
        //displays priorityqueue based on getAge
        System.out.println("Highest GPA First: " + higherGPAFirst);

    }
}
