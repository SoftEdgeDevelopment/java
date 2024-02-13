package unit12.exceptions.learning47.customexception;

// Custom exception class
public class CurrencyMismatchException extends Exception {
    public CurrencyMismatchException(String message) {
        super(message);
    }
}
