package unit05.classes.oop.day20.constructors;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        Car car2 = new Car("Yellow", 2010, 145000, true);
        System.out.println(car2);
    }
}
