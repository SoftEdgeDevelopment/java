package unit02.objects.day08;

public class Employee {
    //    declare instance variables as
//    name String
    private String name;
    //    salary double
    private double salary;
//    Create a constructor

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //    Write a void method The method name is increase
//    Increase method will get a double parameter as how much the salary will increase
//    the logic of the increase method is to increase the salary by the parameter and
//    update the salary
    public void increase(double amountOfIncrease) {
        salary = salary + amountOfIncrease;
        System.out.print("The salary is increased by ");
        System.out.println(amountOfIncrease);
    }
//    write a non void method that returns the salary value. getSalary()
    public double getSalary(){
        return salary;
    }
}
