package unit05.classes.oop.day20.encapsulation;

public class DifferentClass {
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
//        System.out.println(a.privateInt);
        System.out.println(a.defaultInt);
        System.out.println(a.publicInt);
        System.out.println(a.protectedInt);
        a.publicInt = 89;
        System.out.println(a.publicInt);
    }
}
