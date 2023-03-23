package unit02.objects.day08;

public class Employee {
    //declare private instance variables for name and salary
    private String name;
    private double salary;
    //generate constructor to assign new parameters to private variables
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //write a void method to get a parameter on how much the salary will increase
    public void salaryIncrease(double amountOfIncrease){
        salary += amountOfIncrease;
        System.out.println("The salary increased by " + amountOfIncrease);
    }
    //write a nonvoid method to return the value of salary
    public double getSalary(){
        //return the value of the salary to getSalary
        return salary;
    }
}
