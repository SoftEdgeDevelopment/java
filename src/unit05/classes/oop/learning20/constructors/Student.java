package unit05.classes.oop.learning20.constructors;
//example of calling private variables to the main method without generating a constructor (null)
public class Student {
    //create private variables for the students information
    private String id;
    private String fullName;
    private int age;
    private double gpa;
    private boolean isGraduated;

    //create main method
    public static void main(String[] args) {
        //without making a constructor, java will make one automatically to reference student1 to object
        Student student1 = new Student();
        //objects are assigned to null
        System.out.println(student1.id);
        System.out.println(student1.fullName);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isGraduated);
    }
}


