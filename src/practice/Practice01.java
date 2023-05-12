package practice;

//new class created for House
class House{
    //private variables for street, address, color
    private int street;
    private String address;
    private String color;
    //create public House constructor with new parameters for street, address, and color
    public House (int houseStreet, String houseAddress, String houseColor){
        //assign private variables to their new parameters
        street = houseStreet;
        address = houseAddress;
        color = houseColor;
        System.out.println("A Message from housing community, new resident has moved in at ");
        System.out.print(street + ", ");
        System.out.println(address + ", ");
        System.out.println("The house color is");
        System.out.println(color);
        System.out.println("-----------------------------------------------------");
    }
}
//new class created for student
class Student {
    //create private String for name
    private String name;
    //create private double for gpa
    private double gpa;
    //generate constructor
    public Student(String studentName, double studentGPA){
        //assign private variables new parameters
        name = studentName;
        gpa = studentGPA;
        //this code will run line for line when called from the main
        System.out.println("Message from the Student Class");
        System.out.println("A student is created with the name");
        System.out.println(name);
        System.out.println("Their GPA is: ");
        System.out.println(gpa);
        System.out.println("-----------------------------------------------------");
    }
}
//public class created (main) to pull from the other classes
public class Practice01
{
    public static void main(String[] args) {
        System.out.println("Start of the Main");
        System.out.println("-----------------------------------------------------");
        //------------------------------------------------------------------------------------------------
        //create new House object from new variable "johnsHouse" pulled from House class, and assign parameters
        House johnsHouse = new House(14708,"Berry Street","Red");
        //------------------------------------------------------------------------------------------------
        //new objects (student1, student2) created and pulled to Student Class
        Student student1 = new Student("John",3.7);
        Student student2 = new Student("Lisa",4.8);

    }
}
