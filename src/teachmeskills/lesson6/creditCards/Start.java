package teachmeskills.lesson6.creditCards;

import teachmeskills.lesson6.creditCards.entity.CreditCard;
import teachmeskills.lesson6.creditCards.service.CreditCardService;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard creditCard1 = new CreditCard("1255 8014 3212 5443", 100);

        CreditCard creditCard2 = new CreditCard();
        
        creditCard2.setCardNumber("2255 8014 3212 5443");
        creditCard2.setCardBalance(200);

        CreditCard creditCard3 = new CreditCard("3255 8014 3212 5443", 300);

        CreditCard[] arrayCard = {creditCard1, creditCard2, creditCard3};

        while (true) {
            System.out.println("Выберите кредитную карту");
            System.out.println("1) " + creditCard1.getCardNumber());
            System.out.println("2) " + creditCard2.getCardNumber());
            System.out.println("3) " + creditCard3.getCardNumber());
            System.out.println("4) Инфо о всех кредитных картах");

            byte numberOfCard = 0;
            boolean flag = true;

            while (numberOfCard < 1 || numberOfCard > 4) {
                if (flag == false) {
                    System.out.println("Введите корректное значение");
                }
                flag = false;
                numberOfCard = scanner.nextByte();
            }

            CreditCardService creditCardService = new CreditCardService();

            if (numberOfCard == 4) {
                for (int i = 0; i < arrayCard.length; i++) {
                    creditCardService.infoAboutCard(arrayCard[i].getCardNumber(), arrayCard[i].getCardBalance());
                    
                    System.out.println();
                }
            }
            else {
                numberOfCard -= 1;

                System.out.println("Выберите номер операции: ");
                System.out.println("1) Начисление суммы на карту");
                System.out.println("2) Снятие суммы с карты");
                System.out.println("3) Инфо о карте");

                flag = true;
                byte numberOfOperation = 0;

                while (numberOfOperation < 1 | numberOfOperation > 3) {
                    if (flag == false) {
                        System.out.println("Введите корректное значение");
                    }

                    flag = false;

                    numberOfOperation = scanner.nextByte();

                    switch (numberOfOperation) {
                        case 1:
                            arrayCard[numberOfCard].setCardBalance(creditCardService.increaseCardBalance
                                    (arrayCard[numberOfCard].getCardBalance()));
                            break;
                        case 2:
                            arrayCard[numberOfCard].setCardBalance(creditCardService.decreaseCardBalance
                                    (arrayCard[numberOfCard].getCardBalance()));
                            break;
                        case 3:
                            creditCardService.infoAboutCard(arrayCard[numberOfCard].getCardNumber(),
                                    arrayCard[numberOfCard].getCardBalance());
                    }
                }
            }
        }
    }
}
