package unit05.classes.oop.day19.classaccesslevel.mainpackage;

import unit05.classes.oop.day19.classaccesslevel.package1.PublicLevelClass;
//will not work because it is a default class
//import unit05.classes.oop.day19.ClassAccessLevel.package2.DefaultLevelClass;

public class MainMethodClass {
    public static void main(String[] args) {
        //call to package 1 public level class
        PublicLevelClass publicLevelClass = new PublicLevelClass();

        //will not work because default class can not be reached from different packages
        //DefaultLevelClass x = new DefaultLevelClass();
    }
}
