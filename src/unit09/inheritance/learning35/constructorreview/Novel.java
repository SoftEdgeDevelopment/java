package unit09.inheritance.learning35.constructorreview;

public class Novel extends Book{
    private String genre;

    //super() constructor from Book
    public Novel(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    //generate getters and setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
