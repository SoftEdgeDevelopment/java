package unit05.classes.oop.day20.constructors;

public class Employee {
    private String id;
    private double salary;
    private boolean isManager;
    private String employeeName;

    public Employee(String id, double salary, boolean isManager, String employeeName) {
        this.id = id;
        this.salary = salary;
        this.isManager = isManager;
        this.employeeName = employeeName;
    }

    public Employee() {
        id = "giveID";
        salary = 90000;
        isManager = false;
        employeeName = "John Doe";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    /*
    * Employee id
    * salary
    * isManager
    * employee name
    * two constructors, one with all parameters, one with no parameters
    * make sure to generate toString method*/
}
