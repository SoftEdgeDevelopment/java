package unit09.inheritance.learning34.inheritancepractice;

public class SchoolMain {
    public static void main(String[] args) {
        //new Person object created from Person class
        Person person1 = new Person();
        //will display that the class Person is studying from the method
        person1.study();
        Student student1 = new Student();
        student1.study();
    }
}
