package unit09.inheritance.learning34.bookpractice;

//new class extending book
public class TextBook extends Book{
    private String subject;

    //generate constructor extending Book class (after book class)
    public TextBook(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    //getters and setters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    //override to string

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
