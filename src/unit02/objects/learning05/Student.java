package unit02.objects.learning05;

//new class for Student created
public class Student {
    //new private variable String for name
    private String name;
    //new private variable String for studentID
    private String studentId;
    //new private variable double for gpa
    private double gpa;

    //generate constructor with variables
    public Student(String myName, String myId, double myGpa){
        //assign new variables
        name = myName;
        studentId = myId;
        gpa = myGpa;
    }

    //main method
    public static void main(String[] args) {

    }
}
