package exception;

public class personNotFoundException extends RuntimeException {
    public personNotFoundException(String message) {
        super(message);
    }

}
