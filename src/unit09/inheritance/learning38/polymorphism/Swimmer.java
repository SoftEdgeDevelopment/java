package unit09.inheritance.learning38.polymorphism;

public class Swimmer extends Athlete{
    //super constructor
    public Swimmer(String name) {
        super(name);
    }

    //override practice method from Athlete
    @Override
    public void practice() {
        super.practice();
    }

    public void swim(){
        System.out.println("The swimmer is swimming");
    }
}
