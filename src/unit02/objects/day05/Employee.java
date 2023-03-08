package unit02.objects.day05;

//new class Employee created
public class Employee {
    //new private variable String for name created
    private String name;
    //new private variable String for employeeID created
    private String employeeId;
    //new private for double variable for salary created
    private double salary;

    //generate constructor for new variables
    public Employee(String myName, String myId, double mySalary){
        //assign new variables to private values
        name = myName;
        employeeId = myId;
        salary = mySalary;
    }

    //main created
    public static void main(String[] args) {

    }
}
