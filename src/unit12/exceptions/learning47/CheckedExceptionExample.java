package unit12.exceptions.learning47;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample{
    //checked exception example, add exception to method signature
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println("Searching for file...");
            FileReader fileReader = new FileReader("noFile.png");
        } catch (FileNotFoundException e) {
            System.out.println("No file was found...");
        }

        //add exception to method signature
        FileReader fileReader = new FileReader("noFile.png");
    }
}
