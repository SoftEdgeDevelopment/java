package unit09.inheritance.learning37.objectclass;


import java.util.Objects;

class Main {
    public static void main(String[] args) {
        //create new object
        ToStringMethodExample object = new ToStringMethodExample();
        //returns the data type of the object unless override to string method is created from the class
        System.out.println(object.toString());
        ToStringMethodExample anotherObject = new ToStringMethodExample();
        //checks if the values are the same object methods
        //it will return FALSE if //generate equals() and hashCode() method is missing
        System.out.println(object.equals(anotherObject));
    }
}

public class ToStringMethodExample {
    private String someWords;

    //generate constructor with no parameters and assign value
    public ToStringMethodExample() {
        someWords = "Hello World";
    }

    //generate toString method
    @Override
    public String toString() {
        return "ToStringMethodExample{" +
                "someWords='" + someWords + '\'' +
                '}';
    }

    //generate equals() and hashCode() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToStringMethodExample that = (ToStringMethodExample) o;
        return Objects.equals(someWords, that.someWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someWords);
    }
}
