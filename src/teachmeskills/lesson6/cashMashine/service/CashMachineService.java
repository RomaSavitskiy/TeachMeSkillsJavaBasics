package teachmeskills.lesson6.cashMashine.service;

import java.util.Scanner;

public class CashMachineService {
    Scanner scanner = new Scanner(System.in);

    public long[] addedMoney(long[] arrayMoney) {
        System.out.println("Введите количество добавляемых купюр по 20, по 50 и по 100 соответсвенно");

        long amountAdded20 = scanner.nextLong();
        long amountAdded50 = scanner.nextLong();
        long amountAdded100 = scanner.nextLong();

        arrayMoney[0] += amountAdded20;
        arrayMoney[1] += amountAdded50;
        arrayMoney[2] += amountAdded100;

        return arrayMoney;
    }

    public long[] withdrawalMoney(long[] arrayMoney) {
        System.out.println("Введите количество снимемых купюр по 20, по 50 и по 100 соответсвенно");

        long amountWithdrawal20 = 0;
        long amountWithdrawal50 = 0;
        long amountWithdrawal100 = 0;

        amountWithdrawal20 = scanner.nextLong();
        amountWithdrawal50 = scanner.nextLong();
        amountWithdrawal100 = scanner.nextLong();

        if ((arrayMoney[0] >= amountWithdrawal20) & (arrayMoney[1] >= amountWithdrawal50)
                & ( arrayMoney[2] >= amountWithdrawal100)) {
            arrayMoney[0] -= amountWithdrawal20;
            arrayMoney[1] -= amountWithdrawal50;
            arrayMoney[2] -= amountWithdrawal100;
            arrayMoney[3] = 1;
        }

        return arrayMoney;
    }
}

