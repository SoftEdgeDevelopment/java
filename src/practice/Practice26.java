package practice;

//call to override methods to display different information in subclasses for the same method for different objects and downcasting to call object

import java.util.ArrayList;

//main method
class Main {
    public static void main(String[] args) {
        //create new objects for each subclass
        unit09.inheritance.learning37.polymorphism.Animal animal = new unit09.inheritance.learning37.polymorphism.Animal();
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
        ArrayList<Practice26> farm = new ArrayList<>();
        farm.add(new Practice26());
        farm.add(new Cat());
        farm.add(new Dog());
        farm.add(new Pig());
        farm.add(new Bird());

        //for all the animals elements in the farm arraylist
        for (Practice26 animals : farm) {
            //get the class for each object
            System.out.println(animals.getClass().getSimpleName() + " :");
            //call to the override method for each animals to display its sound
            animals.animalSound();
            //this wil not work
            //animals.sleeping();
            //must be DOWNCASTED like the method below V, however it must match the object you are looking for;
        }

        System.out.println("-------------------------");
        Cat cat1 = new Cat();
        //will not work because it is being created from Animal object
        //cat1.sleeping();
        cat1.animalSound();
        //this will not work
        //cat1.sleeping();
        //must be DOWNCASTED like the method below V, however it must match the object you are looking for;
        ((Cat) cat1).sleeping();
        //this will not work because eating is part of the Pig class
        //cat.eating();
        dog.playing();

        System.out.println("--------------------");
        //for all the animals elements in the farm arraylist
        for (Practice26 animals : farm) {
            //if the animal is an object instanceof Cat class
            if (animals instanceof Cat) {
                //downcast to Cat for sleeping method
                ((Cat) animals).sleeping();
            } else if (animals instanceof Bird) {
                ((Bird) animals).flying();
            }
        }

    }
}


public class Practice26 {
    //new super() method for animal making noise
    public void animalSound() {
        System.out.println("The animal is making noise");
    }

}

class Cat extends Practice26 {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Meow");
    }

    public void sleeping() {
        System.out.println("sleeping");
    }
}

class Dog extends Practice26 {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Woof Woof");
    }

    public void playing() {
        System.out.println("playing with a ball");
    }
}

class Pig extends Practice26 {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Oink Oink");
    }

    public void eating() {
        System.out.println("eating slop");
    }
}

class Bird extends Practice26 {

    //override animalSound method
    @Override
    public void animalSound() {
        //remove super()
        //super.animalSound();
        System.out.println("Kaw Kawww");
    }

    //new void method for flying
    public void flying() {
        System.out.println("flying");
    }
}
