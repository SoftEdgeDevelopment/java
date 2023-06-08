package unit05.classes.oop.learning20.encapsulation;

public class EncapsulationExample {
    private int privateInt; //only accessed within the package
    protected int protectedInt; //available within package or sub packages
    public int publicInt; //available anywhere
    int defaultInt; //available within package or sub packages

    //static is not related to object but related to class
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        //can be reached because it is in the same class
        System.out.println(a.privateInt);
        //can only be reached within the same package or sub package
        System.out.println(a.defaultInt);
        //can be reached from anywhere
        System.out.println(a.publicInt);
        //can only be reached within the same package or sub package
        System.out.println(a.protectedInt);

    }
}
