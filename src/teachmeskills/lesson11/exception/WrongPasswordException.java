package teachmeskills.lesson11.exception;

public class WrongPasswordException extends Exception {
    private String exceptionInfo;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
        this.exceptionInfo = message;
    }
}
