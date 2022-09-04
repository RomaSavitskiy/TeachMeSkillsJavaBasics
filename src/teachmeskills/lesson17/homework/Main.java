package teachmeskills.lesson17.homework;

import teachmeskills.lesson17.homework.service.IpService;

public class Main {
    public static void main(String[] args) {
        IpService ipService = new IpService();

        while (true) {
            System.out.println("Введите проверяемый ip адрес");
            System.out.println(ipService.checkValidIp(ipService.inputIp()));
        }
    }
}
