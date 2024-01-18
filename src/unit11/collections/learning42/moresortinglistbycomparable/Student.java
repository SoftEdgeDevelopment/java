package unit11.collections.learning42.moresortinglistbycomparable;

public class Student implements Comparable<Student> {
    //making gpa as a Double
    private Double gpa;
    private String name;

    //generate constructor
    //must turn original "double" into Double gpa
    public Student(Double gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    //override toString method
    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }

    //implement compareTo method using Double gpa
    @Override
    public int compareTo(Student o) {
        return this.gpa.compareTo(o.gpa);
    }
}
