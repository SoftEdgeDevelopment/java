package unit10.abstractandinterface.learning39.abstractclassescreation;


import java.util.ArrayList;
//practice implementation with abstract class creating objects calling override methods
public class Main {
    public static void main(String[] args) {
        //new array list for farm for Animal class
        ArrayList<Animal> farm = new ArrayList<>();
        //add each animal object to the array list
        farm.add(new Cat());
        farm.add(new Cow());
        farm.add(new Dog());
        farm.add(new Pig());

        //for each animals object in the Animal class in the farm array
        for (Animal animals : farm) {
            //call to each override method to make the animal sound
            animals.makeSound();
        }
    }
}
