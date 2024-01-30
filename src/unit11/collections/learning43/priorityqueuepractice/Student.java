package unit11.collections.learning43.priorityqueuepractice;

public class Student {
    //private variables for student age and GPA
    private int age;
    private double GPA;

    //generate constructor
    public Student(int age, double GPA) {
        this.age = age;
        this.GPA = GPA;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    //override toString method
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
