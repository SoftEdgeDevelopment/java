package unit02.objects.learning07;

//new public class for the main method
public class HumanMain {
    public static void main(String[] args) {
        //new objects created with names assigned
        Human human1 = new Human("John Doe");
        Human human2 = new Human("Mike James");
        //new object created with no parameters
        Human human3 = new Human();
        //call the printName method and display the new objects
        human1.printName();
        human2.printName();
        //this will call to the method with no parameters
        human3.printName();
        //will give the address that the value is stored without @Override
        System.out.println(human2);
    }
}
