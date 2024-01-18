package unit11.collections.learning42.moresortinglistbycomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    //different ways for sorting List using a class and implementing Comparable casting to Double to compare decimal numbers
    public static void main(String[] args) {
        //new List using Student class
        List<Student> studentList = new ArrayList<>();
        //add each new Student object manually
        studentList.add(new Student(2.5, "John"));
        studentList.add(new Student(1.6, "Mike"));
        studentList.add(new Student(4.0, "Eric"));
        studentList.add(new Student(2.3, "Frank"));
        studentList.add(new Student(1.2, "Kim"));
        studentList.add(new Student(3.5, "Joe"));
        studentList.add(new Student(2.3, "Zak"));

        //display original (insertion) order
        System.out.println("Insertion Order: " + studentList);

        //display natural order based on GPA from least to greatest
        studentList.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + studentList);

        //display natural order based on GPA from greatest to least
        studentList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + studentList);
    }
}
