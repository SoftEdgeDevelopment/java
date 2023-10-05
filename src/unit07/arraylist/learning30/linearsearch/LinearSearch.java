package unit07.arraylist.learning30.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

//linear search method to display array list information from another class

public class LinearSearch {
    public static void main(String[] args) {
        //new student objects created from the Student class with name and id
        Student student1 = new Student("John Jones","QU23456");
        Student student2 = new Student("Kate Spade","IG82938");
        Student student3 = new Student("Mark Mike","GH92345");
        //new array list classroom calling to the student class, as list with the student objects
        ArrayList<Student> classroom = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(classroom);
        //calling to the findStudent method using classroom array list and students ID number, returns the students index
        System.out.println(findStudent(classroom,"GH92345"));
        //returns -1 because the student ID is not found in the classroom
        System.out.println(findStudent(classroom,"AA52347"));
    }

    //new method to find the Students ID
    public static int findStudent(ArrayList<Student> students, String id){
        for (int i = 0; i < students.size(); i++) {
            //in the students array list, get the index element, and get the ID as a string, and check if the ID matches
            if(students.get(i).getId().equals(id)){
                //return the found id
                return i;
            }
        }
        //the id is not found
        return -1;
    }
}

//new class created for Students with private Strings for name and id as variables
class Student {
    private String name;
    private String id;

    //generate constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //create getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //override to string to display information
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + '}';
    }
}

