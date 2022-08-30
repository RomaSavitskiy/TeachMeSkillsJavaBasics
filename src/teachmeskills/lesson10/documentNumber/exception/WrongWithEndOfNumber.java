package teachmeskills.lesson10.documentNumber.exception;

public class WrongWithEndOfNumber extends Exception {
    private String info;

    public WrongWithEndOfNumber() {
        this.info = "Incorrect number" ;
    }

    public WrongWithEndOfNumber(String message) {
        super(message);
        info = message;
    }
}
