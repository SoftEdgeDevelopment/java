package unit11.collections.learning42.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortCustomObjectsMain {
    public static void main(String[] args) {
       Student student1 = new Student("John", 22);
        Student student2 = new Student("Michael", 29);
        Student student3 = new Student("Zak", 14);
        Student student4 = new Student("Aaron", 37);

        //new list calling from the Student class
        List<Student> students = new ArrayList<>(List.of(student1,student2,student3,student4));
        //Comparator will not work for sorting natural order example
        //students.sort(Comparator.naturalOrder());

    }
}
