package unit02.objects.learning06;

public class Student {
    //new private variables for name and gpa
    private String name;
    private double gpa;

    //new public to initialize student class with new variables for name and gpa
    public Student(String theName,double theGpa){
        //assign new values to name and gpa
        name = theName;
        gpa = theGpa;
        //normally don't write messages in the constructor
        System.out.println("Message from the Constructor");
        System.out.println("A student is added to the registry with the name " + name);
        System.out.println("Their grade is " + gpa);
    }
    //the main can also be written in here
    public static void main(String[] args) {
        System.out.println("---Main Started---");
        //call from the Student class and create new objects to assign variables for the name and gpa
        Student student1 = new Student("John Doe", 3.74);
        Student student2 = new Student("Mike Myers", 2.7);
        System.out.println("---Main Finished---");
    }
}
