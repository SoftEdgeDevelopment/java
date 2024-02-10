package unit12.exceptions.learning47;

import java.io.FileNotFoundException;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        //unchecked exceptions do not need to be handled, checked exceptions must be try/catch
        divide();
        try {
            System.out.println("Searching for file...");
            openFile();
        }catch (FileNotFoundException e){
            System.out.println("No file found...");
        }
    }

    //unchecked exceptions do not need to be handled
    public static void divide() throws RuntimeException{
        System.out.println("An unchecked exception has occurred...");
    }

    //checked exceptions must be try/catch
    public static void openFile() throws FileNotFoundException {
        System.out.println("Throws a checked exception");
    }
}
