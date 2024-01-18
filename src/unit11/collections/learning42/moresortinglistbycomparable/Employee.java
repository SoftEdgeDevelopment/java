package unit11.collections.learning42.moresortinglistbycomparable;

public class Employee {
    private String name;
    private int age;
    private double salary;

    //generate constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //generate getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //generate override toString method

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
