package unit05.classes.oop.day19.classaccesslevel.package2;

import unit05.classes.oop.day19.classaccesslevel.package1.PublicLevelClass;

public class MainClassInPackage2 {
    public static void main(String[] args) {
        DefaultLevelClass defaultLevelClass = new DefaultLevelClass();
        PublicLevelClass publicLevelClass = new PublicLevelClass();
    }
}
