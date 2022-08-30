package teachmeskills.lesson10.documentNumber.exception;

public class WrongWithStartDocumentFromFive extends Exception {
    private String info;

    public WrongWithStartDocumentFromFive() {
        this.info = "Incorrect number" ;
    }

    public WrongWithStartDocumentFromFive(String message) {
        super(message);
        info = message;
    }
}
