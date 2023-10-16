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

    //another way calling superclass constructor (the constructor with parameters) by overloading constructor
    public SubClass(String forSuperClass, String subClassVariable){
        //super must always be on the first line of the constructor
        super(forSuperClass);
        this.subClassVariable = subClassVariable;
    }

    //getters and setters
    public String getSubClassVariable() {
        return subClassVariable;
    }

    public void setSubClassVariable(String subClassVariable) {
        this.subClassVariable = subClassVariable;
    }
}
