package unit05.classes.oop.learning21.gettersandsetters;
//Student class created with getters to call from the main and setters to change the values of parameters of the object in the main
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
    //setter methods for the instance variables
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGpa(double gpa){
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
    //override to string


    @Override
    public String toString() {
        return "The student " + name + " is registered to ID: " + id + " and their GPA is " + gpa;
    }
}
