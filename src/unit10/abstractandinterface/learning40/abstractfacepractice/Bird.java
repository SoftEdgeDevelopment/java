package unit10.abstractandinterface.learning40.abstractfacepractice;

//abstract class for bird
public abstract class Bird extends Animal implements Flyable{

    //generate super() constructor
    public Bird(String species) {
        super(species);
    }
}
