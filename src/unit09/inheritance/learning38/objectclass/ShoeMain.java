package unit09.inheritance.learning38.objectclass;

//equals and hashcode methods to check if objects are the same calling from classes
public class ShoeMain {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe(8,"Blue");
        Shoe shoe2 = new Shoe(8,"Red");
        Shoe shoe3 = new Shoe(8,"Blue");

        System.out.println(shoe1.equals(shoe2));
        System.out.println(shoe2.equals(shoe3));
        System.out.println(shoe1.equals(shoe3));

        System.out.println("---------");

        Shoe sportsShoe1 = new SportShoe(8,"White","Soccer");
        Shoe sportsShoe2 = new SportShoe(8,"White","Basketball");
        Shoe sportsShoe3 = new SportShoe(8,"White","Soccer");

        //all will display as true because the equals method only checks for int size and String color from the Shoe class, must generate super() equals and hashcode methods in SportShoe class
        System.out.println(sportsShoe1.equals(sportsShoe2));
        System.out.println(sportsShoe2.equals(sportsShoe3));
        System.out.println(sportsShoe1.equals(sportsShoe3));
    }
}
