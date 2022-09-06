package teachmeskills.lesson17.regularExpressions;

import teachmeskills.lesson17.regularExpressions.service.RegularExpressionsService;

public class Main {
    public static void main(String[] args) {
        RegularExpressionsService regularExpressionsService = new RegularExpressionsService();

        System.out.println(regularExpressionsService.checkStringTaskOne("123aaaaa!s"));
    }
}
