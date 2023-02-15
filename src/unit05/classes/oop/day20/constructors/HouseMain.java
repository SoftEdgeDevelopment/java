package unit05.classes.oop.day20.constructors;

public class HouseMain {
    public static void main(String[] args) {
        House house1 = new House();
        System.out.println(house1);
        House house2 = new House("White", "Casablanca, Morocco", 25000, true);
        System.out.println(house2);
        /*
        Create two House object
        one with no parameter constructor
        one with parameter constructor
        print them on the screen
        * */
    }
}
