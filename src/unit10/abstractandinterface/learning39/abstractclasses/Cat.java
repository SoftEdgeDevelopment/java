package unit10.abstractandinterface.learning39.abstractclasses;

//will be an error - must implement abstract methods
public class Cat extends AnimalAbstract{
    @Override
    public void animalSound() {
        System.out.println("Meow, meow...");
    }
}
