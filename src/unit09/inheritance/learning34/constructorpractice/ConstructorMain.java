package unit09.inheritance.learning34.constructorpractice;

public class ConstructorMain {
    public static void main(String[] args) {
        //new subclass object created from Subclass
        SubClass subclass = new SubClass();
        //get superclass and subclass variables
        System.out.println(subclass.getSuperVariable());
        System.out.println(subclass.getSubClassVariable());
    }
}
