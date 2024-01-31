package unit11.collections.learning43.set.treeset;

import java.util.Objects;

//must implement comparable as itself
public class Student implements Comparable<Student> {
    private String name;
    private double GPA;

    // Constructor
    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // Implementing compareTo for Comparable interface
    @Override
    public int compareTo(Student other) {
        // Assuming we want to sort students by their GPA
        return Double.compare(this.GPA, other.GPA);
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    // equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.GPA, GPA) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, GPA);
    }
}
