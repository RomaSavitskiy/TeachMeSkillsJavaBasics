package teachmeskills.lesson6.cashMashine;

import teachmeskills.lesson6.cashMashine.entity.CashMachine;
import teachmeskills.lesson6.cashMashine.service.CashMachineService;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(15, 20, 30);
        Scanner scanner = new Scanner(System.in);
        CashMachineService cashMachineService = new CashMachineService();

        while (true) {
            System.out.println("Количество купюр по 20 - " + cashMachine.getAmount20());
            System.out.println("Количество купюр по 50 - " + cashMachine.getAmount50());
            System.out.println("Количество купюр по 100 - " + cashMachine.getAmount100());
            System.out.println("Выберите тип операции:");
            System.out.println("1) Внесение купюр");
            System.out.println("2) Снятие купюр");

            long arrayMoney[] = {cashMachine.getAmount20(), cashMachine.getAmount50(), cashMachine.getAmount100(), 0};

            byte idOperations = scanner.nextByte();

            switch (idOperations) {
                case 1:
                    cashMachineService.addedMoney(arrayMoney);
                    cashMachine.setAmount20(arrayMoney[0]);
                    cashMachine.setAmount50(arrayMoney[1]);
                    cashMachine.setAmount100(arrayMoney[2]);
                    break;
                case 2:
                    cashMachineService.withdrawalMoney(arrayMoney);
                    cashMachine.setAmount20(arrayMoney[0]);
                    cashMachine.setAmount50(arrayMoney[1]);
                    cashMachine.setAmount100(arrayMoney[2]);

                    if (arrayMoney[3] == 1) {
                        System.out.println("Операция выполнена успешно");
                    }
                    else {
                        System.out.println("Операция выполнена неудачно");
                    }
                    break;
            }
        }
    }

}
