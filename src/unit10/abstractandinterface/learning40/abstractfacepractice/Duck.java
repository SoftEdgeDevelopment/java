package unit10.abstractandinterface.learning40.abstractfacepractice;

//Duck extending bird abstract class implementing swimable interface
public class Duck extends Bird implements Swimable{
    public Duck(String species) {
        super(species);
    }

    //generate implement methods
    @Override
    public void animalSound() {
        System.out.println("Quack");

    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");

    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }

}
