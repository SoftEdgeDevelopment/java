package unit07.arraylist.learning31.arraylistsinclasses;

import java.util.ArrayList;

//create objects calling to different classes, displaying and getting info for array list

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Jones", 8);
        Student student2 = new Student("Mike Mars", 5);
        Student student3 = new Student("Erin Elk", 3);
        Student student4 = new Student("Karen Kate", 7);
        Student student5 = new Student("Jim Mac", 8);
        ArrayList<Student> classroom = new ArrayList<>();
        classroom.add(student1);
        classroom.add(student2);
        classroom.add(student3);
        System.out.println(classroom.size() + " students in the classroom");
        //call to the Student class to display students in the classroom
        Student.displayStudents(classroom);
        classroom.add(student4);
        classroom.add(student5);
        System.out.println("new students added");
        System.out.println(classroom.size() + " students in the classroom");
        //call to the Student class to display students in the classroom
        Student.displayStudents(classroom);
    }
}
class Student{
    private String name;
    private int gradeLevel;
    private ArrayList<Student> studentsList;
    //private ArrayList<Student> studentsList = new ArrayList<>();

    //constructor
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        //assign studentsList array list to new array list
        this.studentsList = new ArrayList<>();
        //studentsList.add(this);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    //to string method to display info
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", studentsList=" + studentsList +
                '}';
    }

    // method to display students using array list calling to the Student class as parameter
    public static void displayStudents(ArrayList<Student> classroom) {
        //foreach Student object in the classroom Array List
        for (Student student : classroom) {
            //display each student with the getter method
            System.out.println(student.getName());
        }
    }
}
