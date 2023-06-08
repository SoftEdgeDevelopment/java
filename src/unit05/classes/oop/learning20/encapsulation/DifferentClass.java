package unit05.classes.oop.learning20.encapsulation;
//examples of what can and cannot be reached from different class / package
public class DifferentClass {
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        //only 1 that cannot be reached because it is not in the same class
        //System.out.println(a.privateInt);
        //can only be reached within the same package or sub package
        System.out.println(a.defaultInt);
        //can be reached from anywhere
        System.out.println(a.publicInt);
        //can only be reached within the same package or sub package
        System.out.println(a.protectedInt);
        a.publicInt = 17;
        System.out.println(a.publicInt);
    }
}
