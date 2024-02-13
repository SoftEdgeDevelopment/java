package unit12.exceptions.learning47.subclassexceptionrules;

public class SuperClass {
    public void method() throws Exception {
        //method logic normally goes here, but leave empty for this example
    }

    class subclass extends SuperClass {

        //no exception throw is allowed
        //public void method(){}

        //you can throw same level of exception with the superclass
         //public void method() throws Exception{}

        //you can throw the subclass level of exception with the superclass
        //public void method() throws NullPointerException{}

        //you cant throw the super class level of exception with the superclass
        //public void anotherMethod() throws Exception{}
    }
}
