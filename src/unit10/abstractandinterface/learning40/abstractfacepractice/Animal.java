package unit10.abstractandinterface.learning40.abstractfacepractice;

//abstract class
public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }



    //non abstract method
    public void breathe(){
        System.out.println("Breathe in, Breathe out.");
    }

    //abstract method
    public abstract void animalSound();

    //getter
    public String getSpecies() {
        return species;
    }
}
