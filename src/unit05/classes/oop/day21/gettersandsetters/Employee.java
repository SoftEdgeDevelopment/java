package unit05.classes.oop.day21.gettersandsetters;

import java.util.Scanner;

//class created with getters to call from the main and setters to change the values of parameters of the object in the main and string override, display all the information of the object
public class Employee {
    //private variables created to assign to main
    private String name;
    private int age;
    private double salary;
    private boolean isHired;


    //new constructor with no parameters, variables assigned
    public Employee(){
        this.name = "Mike";
        this.age = 17;
        this.salary = 135000;
        this.isHired = false;
    }
    //new constructor with parameters for values assigned to private variables
    public Employee(String name, int age, double salary, boolean isHired) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isHired = isHired;
    }


    //generate getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    //generate override to string method to display the information in the main
    @Override
    public String toString() {
        return "The persons name is " + name + " and they are " + age + " years old with a salary of " + salary + " and is registered as an employee: " + isHired;
    }

    //main method
    public static void main(String[] args) {
        //create new object for employee
        Employee employee1 = new Employee("James Bond", 42, 150000.50,true);
        Employee employee2 = new Employee();
        System.out.println(employee1);
        employee1.getAge();
        employee1.setAge(87);
        System.out.println(employee1.age);
        employee1.setHired(false);
        employee1.setSalary(12);
        System.out.println(employee1);
        employee1.setName("Jim Joe");
        System.out.println(employee1);
        System.out.println(employee2);


    }
}
