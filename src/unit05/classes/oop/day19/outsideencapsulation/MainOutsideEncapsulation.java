package unit05.classes.oop.day19.outsideencapsulation;

import unit05.classes.oop.day19.encapsulation.EncapsulationExample;
//OutsideEncapsulation - examples of what variables can be reached and cannot be reached outside of package
public class MainOutsideEncapsulation {
    //call to the encapsulation package
    public static void main(String[] args) {
        //can create EncapsulationExample object because it is public from encapsulation package
        EncapsulationExample a = new EncapsulationExample();
        //can only reach the publicNum variable because it is public
        a.publicNum = 7;
        //can call to the private num method but not the variable to change
        a.setPrivateNum();
        //can not reach protected or default variables because they are only available within the same package or sub packages
    }
}
