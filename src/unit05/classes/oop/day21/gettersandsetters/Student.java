package unit05.classes.oop.day21.gettersandsetters;
//Student class created with getters to call from the main
public class Student
{
    //create private variables for id, name, and gpa
    private int id;
    private String name;
    private double gpa;
    //generate constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    //getter method to get the ID
    public int getId(){
        //returns the value of ID as an integer
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }


}
