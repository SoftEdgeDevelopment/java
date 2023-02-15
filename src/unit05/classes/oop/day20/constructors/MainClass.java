package unit05.classes.oop.day20.constructors;

public class MainClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("dew23",100000, false,"John Doe");
        House house1 = new House();
        House house2 = new House("Green","Toronto CA", 600000, false);
        Car car1 = new Car();
        Car car2 = new Car("Red", 2023, 12, true);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(car1);
        System.out.println(car2);
        /*Create two employees
        * two houses
        * two cars*/
    }
}
