package unit05.classes.oop.day19.ClassAccessLevel.package2;

import unit05.classes.oop.day19.ClassAccessLevel.package1.PublicLevelClass;

public class MainClassPackage2 {
    public static void main(String[] args) {
        //can reach both packages because public is available from everywhere
        PublicLevelClass publicLevelClass = new PublicLevelClass();
        //and default is contained in the same package
        DefaultLevelClass defaultLevelClass = new DefaultLevelClass();
    }
}
