package unit03.conditionals.learning14;
//new class with method to call from the MethodExampleWithMainMethod class
//new class for Person
public class Person {
    //new private variable for name
    private String name;
    //generate constructor for name
    public Person(String name) {
        //assign new parameter to private variable
        this.name = name;
    }

    //create new method to print the persons name
    public void printName(){
        System.out.println(name);
    }
}
