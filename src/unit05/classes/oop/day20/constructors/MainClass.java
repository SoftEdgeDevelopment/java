package unit05.classes.oop.day20.constructors;
//call to all the different classes to display information
public class MainClass
{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(837109, 89000, false, "Bill");
        House house1 = new House();
        House house2 = new House("Orange", "8492 West Street", 515000, false);
        Car car1 = new Car();
        Car car2 = new Car("Yellow", 2010, 145000, true);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(car1);
        System.out.println(car2);
    }
}
