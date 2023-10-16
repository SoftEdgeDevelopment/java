package unit09.inheritance.learning34.constructorpractice;

public class SubClass extends SuperClass{
    private String subClassVariable;

    public SubClass(){
        //inheritance of constructor from the superclass
        //must be called in the first line of constructor
        super();
        subClassVariable = "Subclass: Initialized in No Parameter Constructor";
        //this will not work, must be on the first line in the constructor
        //super();
    }

    //getters and setters
    public String getSubClassVariable() {
        return subClassVariable;
    }

    public void setSubClassVariable(String subClassVariable) {
        this.subClassVariable = subClassVariable;
    }
}
