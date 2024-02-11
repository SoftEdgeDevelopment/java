package unit12.exceptions.learning47;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionInADifferentMethod {
    //add exception to method signature to throw exception from different method to the main
    public static void main(String[] args){
        try {
            System.out.println("Searching for file...");
            openAFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
    }

    //new method to throw an exception for FileReader
    public static void openAFile() throws FileNotFoundException {
        //highlight FileReader - add exception to method signature
        FileReader fileReader = new FileReader("file.txt");
    }
}
