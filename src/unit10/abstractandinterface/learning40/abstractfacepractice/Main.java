package unit10.abstractandinterface.learning40.abstractfacepractice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Duck ducky = new Duck("Brown North American");
        Dog doggy = new Dog("Pekin", "Husky");
        Plane boeing = new Plane();
        doggy.animalSound();
        doggy.swim();

        boeing.fly();

        ducky.fly();
        ducky.swim();
        ducky.animalSound();

        ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(ducky);
        flyables.add(boeing);

        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        ArrayList<Swimable> swimmers = new ArrayList<>();
        swimmers.add(ducky);
        swimmers.add(doggy);

        for (Swimable swimmer : swimmers) {
            swimmer.swim();
        }

    }
}
