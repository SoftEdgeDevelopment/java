package unit05.classes.oop.learning22.multipleclasses;
//practice creating multiple classes with objects to be used as instance variables, parameters, and be returned as return values
//main class created to call all the other classes and methods to and run the code
public class MainClass {
    public static void main(String[] args) {
        //create new object for address and assign values to parameters
        Address address1 = new Address("471st ST", "Seattle", "WA","98042");
        //new object for address 2 with a different state than address 1
        Address address2 = new Address("471st ST", "Seattle", "NY","98042");
        //create new object for student and assign address as value for address variable
        Student student1 = new Student("John",3.6,address1);
        //display the info of student1
        System.out.println(student1);
        //display the address of student1
        System.out.println(student1.getAddress());
        //calls to isSameState method using Student class
        System.out.println(student1.isSameState(address1));
        System.out.println(student1.isSameState(address2));
    }
    //objects can be used as instance variables, parameters, and can be returned as return values
}
