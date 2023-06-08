package unit05.classes.oop.learning20.differentpackage;

import unit05.classes.oop.learning20.encapsulation.EncapsulationExample;

public class DiffClassInDiffPackage {
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        //can not be reached because it is not in the same class
        //System.out.println(a.privateInt);
        //can only be reached within the same package or sub package (encapsulation package)
        //System.out.println(a.defaultInt);
        //can be reached from anywhere
        System.out.println(a.publicInt);
        //can only be reached within the same package or sub package
        //System.out.println(a.protectedInt);

    }
}
