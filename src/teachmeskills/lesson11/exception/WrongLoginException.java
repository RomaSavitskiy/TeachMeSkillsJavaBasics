package teachmeskills.lesson11.exception;

public class WrongLoginException extends Exception {
    private String exceptionInfo;

    public void setExceptionInfo() {
    }

    public WrongLoginException(String message) {
        super(message);
        this.exceptionInfo = message;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }
}
