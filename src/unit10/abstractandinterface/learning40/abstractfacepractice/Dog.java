package unit10.abstractandinterface.learning40.abstractfacepractice;

//dog class extending animal super() class implementing swimable interface
public class Dog extends Animal implements Swimable{
    private String breed;

    //generate super() constructor
    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    //generate implement methods
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming in doggy style");
    }
}
