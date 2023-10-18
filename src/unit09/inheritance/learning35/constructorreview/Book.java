package unit09.inheritance.learning35.constructorreview;

//superclass
public class Book {
    private String name;

    //constructor
    public Book(String name) {
        this.name = name;
    }

    //generate getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
