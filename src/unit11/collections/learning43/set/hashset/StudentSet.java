package unit11.collections.learning43.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        //new HashSet using Student class
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Joe", 25));
        studentSet.add(new Student("Joe",38));
        System.out.println(studentSet);
        //after generating equals() and hashCode() methods in the Student class, duplicates will no longer work
        studentSet.add(new Student("Joe",38));
        System.out.println(studentSet);


    }
}
