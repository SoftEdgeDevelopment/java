package unit11.collections.learning44.set.treeset;

import java.util.List;
import java.util.TreeSet;

    public class StudentMain {
        //example with TreeSet using Student class to create and compare student objects using, first, last, subSet, headSet, tailSet, ceiling, floor
        public static void main(String[] args) {
            //new TreeSet using Student class List.of students
            TreeSet<Student> studentTreeSet = new TreeSet<>(List.of(new Student("James", 2.8), new Student("Aaron", 1.3), new Student("Kim", 3.7), new Student("Bill", 2.3), new Student("Frank", 1.9), new Student("Cary", 1.6)));
            //must implement Comparable in the Student class
            //get TreeSet.first for the lowest number in order
            System.out.println("Lowest GPA Student: " + studentTreeSet.first());
            //get TreeSet.last for the highest number in order
            System.out.println("Highest GPA Student: " + studentTreeSet.last());
            //get TreeSet.subSet for all contents between 2.0 - 3.0 (must create empty students as the comparators)
            System.out.println("Students With GPA Between 2.0 - 3.0: " + studentTreeSet.subSet(new Student(" ",2.0),new Student(" ", 3.0)));
            //get TreeSet.headSet to display everything before the search element
            System.out.println("Students With GPA Lower Than 2.5:  " + studentTreeSet.headSet(new Student(" ", 2.5)));
            //get TreeSet.tailSet to display everything after the search element
            System.out.println("Students With GPA Greater Than 3.5:  " + studentTreeSet.tailSet(new Student(" ",3.5)));
            //get TreeSet.ceiling to display the one right after the search element
            System.out.println("The Student With A GPA Greater Than 3.1:  " + studentTreeSet.ceiling(new Student(" ", 3.1)));
            //get TreeSet.floor to display the one right before the search element
            System.out.println("The Student With A GPA Less Than 2.9:  " + studentTreeSet.floor(new Student(" ", 2.9)));
        }
    }


