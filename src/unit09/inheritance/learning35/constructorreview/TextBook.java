package unit09.inheritance.learning35.constructorreview;

public class TextBook extends Book{
    private String subject;

    //generate super() constructor from Book
    public TextBook(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    //generate getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
