package unit05.classes.oop.day19.classaccesslevel.mainpackage;

import unit05.classes.oop.day19.classaccesslevel.package1.PublicLevelClass;

public class MainMethodClass {
    public static void main(String[] args) {
        PublicLevelClass publicLevelClass = new PublicLevelClass();
        PublicLevelClass publicLevelClass1 = new PublicLevelClass();
/*default classes cannot be reached from different packages*/
//        DefaultLevelClass x = new DefaultLevelClass();
    }
}
