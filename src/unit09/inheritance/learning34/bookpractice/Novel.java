package unit09.inheritance.learning34.bookpractice;

//new class extending book
public class Novel extends Book{
    private String genre;

    //generate constructor extending Book class (after book class)
    public Novel(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    //getters and setters

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //override to string

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
