package unit09.inheritance.learning35.constructorreview;

public class BookMain {
    public static void main(String[] args) {
        //create new objects from super constructor to display information from different classes
        Book book1 = new Book("The Hunger Games");
        Novel novel1 = new Novel("The Great Gatsby", "Drama");
        TextBook textBook1 = new TextBook("Algebra 1", "Math");

        //display the information calling to different methods
        System.out.println("Book1 name: " + book1.getName());
        System.out.println("Novel1 name: " + novel1.getName() + ", Novel1 genre: " + novel1.getGenre());
        System.out.println("Textbook1 name: " + textBook1.getName() + ", Textbook1 subject: " + textBook1.getSubject());
    }
}
