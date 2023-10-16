package unit09.inheritance.learning34.bookpractice;


//creating subclass objects inheriting values from superclass
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Novel novel1 = new Novel("The Three Musketeers", "Adventure");
        TextBook textBook1 = new TextBook("Java For Dummies", "Programming Languages");

        //call getName method from book class and getGenre method from Textbook class
        System.out.println("The book " + novel1.getName() + " is an " + novel1.getGenre() + " book");
        //call getName method from book class and getSubject method from Textbook class
        System.out.println("The book " + textBook1.getName() + " is an " + textBook1.getSubject() + " book");
    }
}
