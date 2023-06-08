package unit05.classes.oop.learning20.constructors;
//create constructors with and without parameters, override to string and display the information of the employee
public class Employee {
    //create employee class with variables for employee ID, salary, is manager, employee name
    private int employeeId;
    private double salary;
    private boolean isManager;
    private String name;
    //create a constructor with no parameters and assign values to variables
    public Employee(){
        employeeId = 385746;
        salary = 120000;
        isManager = true;
        name = "John";
    }
    //generate to string method to display the information of the first constructor
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                ", isManager=" + isManager +
                ", name='" + name + '\'' +
                '}';
    }
    //create a new constructor with parameters to be assigned values to variables
    public Employee(int employeeId, double salary, boolean isManager, String name) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.isManager = isManager;
        this.name = name;
    }

    public static void main(String[] args) {
        //call to the first constructor to display employee1 information
        Employee employee1 = new Employee();
        System.out.println(employee1);
        //call to the second constructor and assign values to variables
        Employee employee2 = new Employee(837109,89000,false,"Bill");
        System.out.println(employee2);
    }
}
