package unit09.inheritance.learning34.constructorpractice;

public class ConstructorMain {
    public static void main(String[] args) {
        //new subclass object created from Subclass
        SubClass subclass = new SubClass();
        //get superclass and subclass variables
        System.out.println(subclass.getSuperVariable());
        System.out.println(subclass.getSubClassVariable());
        //new object created from SubClass constructor with parameters
        SubClass subclass1 = new SubClass("Super", "Sub");
        //call to the methods to display subclass and superclass
        System.out.println(subclass1.getSuperVariable());
        System.out.println(subclass1.getSubClassVariable());

    }
}
