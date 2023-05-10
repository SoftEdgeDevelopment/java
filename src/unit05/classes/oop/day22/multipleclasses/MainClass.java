package unit05.classes.oop.day22.multipleclasses;

//main class created to call all the other classes and methods to and run the code
public class MainClass {
    public static void main(String[] args) {
        //create new object for address and assign values to parameters
        Address address1 = new Address("471st ST", "Seattle", "WA","98042");
        //create new object for student and assign address as value for address variable
        Student student1 = new Student("John",3.6,address1);
        //display the info of student1
        System.out.println(student1);
        //display the address of student1
        System.out.println(student1.getAddress());

    }
}
