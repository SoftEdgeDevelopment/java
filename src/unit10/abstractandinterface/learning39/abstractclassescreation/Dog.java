package unit10.abstractandinterface.learning39.abstractclassescreation;

//class extending abstract class
public class Dog extends Animal{
    //override abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
