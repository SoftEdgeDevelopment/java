package unit09.inheritance.learning38.objectclass;

import java.util.Objects;

//practice generating equals and hashcode methods to check if Strings are equal
public class Student {
    private String studentName;
    private String gradeLevel;

    //generate constructor
    public Student(String studentName, String gradeLevel) {
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
    }

    //generate equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(gradeLevel, student.gradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, gradeLevel);
    }
}
