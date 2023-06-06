package unit02.objects.learning08;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James",18.75);
        //call employee1 to salaryIncrease method to increase the salary
        employee1.salaryIncrease(3.42);
        //display message with getSalary method to return the new value of the salary
        System.out.println("The new salary is " + employee1.getSalary());
    }

}
