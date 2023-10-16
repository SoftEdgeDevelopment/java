package unit09.inheritance.learning34.constructorpractice;

public class SuperClass {
    private String superVariable;

    //constructor with no variable
    public SuperClass(){
        superVariable = "Superclass: Created by no parameter Constructor";
    }

    //constructor created with variable
    public SuperClass(String superVariable){
        this.superVariable = superVariable;
    }

    //getters and setters
    public String getSuperVariable() {
        return superVariable;
    }

    public void setSuperVariable(String superVariable) {
        this.superVariable = superVariable;
    }
}
