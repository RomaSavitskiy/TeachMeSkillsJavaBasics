package teachmeskills.lesson6.CreditCards.service;

import java.util.Scanner;

public class CreditCardService {
    Scanner scanner = new Scanner(System.in);

    public int increaseCardBalance(int cardBalance) {
        System.out.println("Текущий баланс: " + cardBalance);
        System.out.println("Введите сумму начисления ");

        int increaseValue = scanner.nextInt();
        cardBalance += increaseValue;

        System.out.println("Теперь баланс состовляет: " + cardBalance);
        return cardBalance;
    }

    public int decreaseCardBalance(int cardBalance) {
        System.out.println("Текущий баланс: " + cardBalance);
        System.out.println("Введите сумму отчисления ");

        int increaseValue = scanner.nextInt();
        cardBalance -= increaseValue;

        System.out.println("Теперь баланс состовляет: " + cardBalance);
        return cardBalance;
    }

    public void infoAboutCard(String cardNumber, int cardBalance) {
        System.out.println("Номер карты:");
        System.out.println(cardNumber);

        System.out.println("Текущая сумма на карте:");
        System.out.println(cardBalance);
    }
}
