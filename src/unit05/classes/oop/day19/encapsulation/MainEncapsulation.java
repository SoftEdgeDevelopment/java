package unit05.classes.oop.day19.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        //new object created
        EncapsulationExample a = new EncapsulationExample();
        //call to default int num using object a
        System.out.println(a.defaultNum);
        //can not reach privateNum because it is private
        //System.out.println(a.privateNum);'
        //public it can be reached and changed
        a.publicNum = 10;
        System.out.println(a.publicNum);
        //protected can be reached within package or sub packages
        a.protectedNum = 11;
        System.out.println(a.protectedNum);
        //default can be reached within package or sub packages
        a.defaultNum = 7;
        System.out.println(a.defaultNum);
    }
}
