package unit09.inheritance.learning35.computerpractice;

public class ComputerMain {
    public static void main(String[] args) {
        //create new computer object from Computer class
        Computer computer1 = new Computer("i5",300);
        //display info from info() method in Computer class
        computer1.info();
        //new laptop object using super() constructor form Computer
        Laptop laptop1 = new Laptop("i7", 500, 16);
        //call to the super constructor method for info() in Laptop class
        laptop1.info();
    }
}
