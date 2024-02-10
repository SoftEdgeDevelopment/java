package unit12.exceptions.learning46;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    //checked exception example using try, catch with a FileReader
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonExistent.txt");
        } catch (FileNotFoundException e) {
            //original output
            //throw new RuntimeException(e);
            System.out.println("No file found... Try again");
        }
        System.out.println("After try... Catch");
    }
}
