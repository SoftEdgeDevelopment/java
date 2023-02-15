package unit02.objects.day08;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe",13.5);

        employee1.increase(15);
        System.out.println(employee1.getSalary());
    }
}
