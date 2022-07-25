package teachmeskills.lesson6.creditCards.entity;

public class CreditCard {

    private String cardNumber;
    private int cardBalance;

    public CreditCard(String cardNumber, int cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public CreditCard() {
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber =  cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public int getCardBalance() {
        return cardBalance;
    }
}
