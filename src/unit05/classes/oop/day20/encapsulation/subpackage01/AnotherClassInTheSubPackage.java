package unit05.classes.oop.day20.encapsulation.subpackage01;

import unit05.classes.oop.day20.encapsulation.EncapsulationExample;

public class AnotherClassInTheSubPackage {

    EncapsulationExample a;

    public AnotherClassInTheSubPackage(EncapsulationExample a) {
        this.a = a;
    }

    public void check(){
        //only public is available within the subpackage
        a.publicInt = 0;
    }





//        EncapsulationExample a = new EncapsulationExample();
//        //can be reached because it is in the same class
//        System.out.println(a.privateInt);
//        //can only be reached within the same package or sub package
//        System.out.println(a.defaultInt);
//        //can be reached from anywhere
//        System.out.println(a.publicInt);
//        //can only be reached within the same package or sub package
//        System.out.println(a.protectedInt);


}
