package teachmeskills.lesson10.documentNumber.exception;

public class WrongWithNumberConstruction extends Exception {
    private String info;

    public WrongWithNumberConstruction() {
        this.info = "Incorrect number" ;
    }

    public WrongWithNumberConstruction(String message) {
        super(message);
        info = message;
    }
}
