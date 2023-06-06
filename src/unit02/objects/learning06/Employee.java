package unit02.objects.learning06;
//new public class for Employee
public class Employee
{
    //new private variables for employee name and salary
    private String name;
    private double salary;

    //right click below this line - generate - constructor - hold ctrl and select all choices - click ok
    //easy way to generate constructor
    public Employee(String name, double salary) {
        //must use this.(variable) because it is the same name and will assign new parameters
        //name = name;  this does not assign the new parameters because it will stay the same
        this.name = name;
        this.salary = salary;
        System.out.println("new object created");
    }


}

