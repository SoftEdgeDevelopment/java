package unit11.collections.learning42.moresortinglistbycomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    //quick way to sort using Comparator.comparing with a class without having to implement
    //must have getters in the class called from
    public static void main(String[] args) {
        //new List using Employee class
        List<Employee> employeeList = new ArrayList<>();

        //add each Employee object manually
        employeeList.add(new Employee("John",33,120000));
        employeeList.add(new Employee("Kim",42,200000));
        employeeList.add(new Employee("Eric",27,80000));
        employeeList.add(new Employee("Aaron",29,165000));


        //must have getters in the class for these to work
        //sort Employees by name using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println("Employee sorted by Name" + employeeList);

        //sort Employees by name in reverse order using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println("Employee sorted by Name Reversed" + employeeList);

        //sort Employees by age using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println("Employee sorted by Age" + employeeList);

        //sort Employees by age in reverse order using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
        System.out.println("Employee sorted by Age Reversed" + employeeList);

        //sort Employees by salary using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println("Employee sorted by Salary" + employeeList);

        //sort Employees by salary in reverse order using Comparator.comparing with the Employee class
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Employee sorted by Salary Reversed" + employeeList);


    }
}
