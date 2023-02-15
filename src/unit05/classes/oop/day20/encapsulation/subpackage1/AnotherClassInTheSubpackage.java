package unit05.classes.oop.day20.encapsulation.subpackage1;

import unit05.classes.oop.day20.encapsulation.EncapsulationExample;

public class AnotherClassInTheSubpackage {

    EncapsulationExample a;

    public AnotherClassInTheSubpackage(EncapsulationExample a) {
        this.a = a;
    }

    public void check(){
        /* ***************************************** */
        /*Only public available within the subpackage*/
        a.publicInt = 0;
    }

    /*    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        System.out.println(a.privateInt);
//        System.out.println(a.defaultInt);
        System.out.println(a.publicInt);
        System.out.println(a.protectedInt);
    }*/
}
