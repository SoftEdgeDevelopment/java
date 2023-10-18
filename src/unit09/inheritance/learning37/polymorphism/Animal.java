package unit09.inheritance.learning37.polymorphism;



//call to override methods to display different information in subclasses for the same method
import java.util.ArrayList;

//main method
class Main {
    public static void main(String[] args) {
        //create new objects for each subclass
        Animal animal = new Animal();
        System.out.println(animal.getClass().getSimpleName() + " :");
        animal.animalSound();
        Cat cat = new Cat();
        System.out.println(cat.getClass().getSimpleName() + " :");
        cat.animalSound();
        Dog dog = new Dog();
        System.out.println(dog.getClass().getSimpleName() + " :");
        dog.animalSound();
        System.out.println("--------------------");
        //............
        //easier way is to make ArrayList, calling to Animal superclass
        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(new Animal());
        farm.add(new Cat());
        farm.add(new Dog());
        farm.add(new Pig());
        farm.add(new Bird());

        //for all the animals elements in the farm arraylist
        for (Animal animals : farm) {
            //get the class for each object
            System.out.println(animals.getClass().getSimpleName() + " :");
            //call to the override method for each animals to display its sound
            animals.animalSound();
        }

    }
}

public class Animal {
    //new super() method for animal making noise
    public void animalSound() {
        System.out.println("The animal is making noise");
    }
}

class Cat extends Animal {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Meow");
    }
}

class Dog extends Animal {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Woof Woof");
    }
}

class Pig extends Animal {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Oink Oink");
    }
}

class Bird extends Animal {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Kaw Kawww");
    }
}
