package teachmeskills.lesson10.documentNumber;

import teachmeskills.lesson10.documentNumber.Service.DocumentNumberService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DocumentNumberService documentNumberService = new DocumentNumberService();

        String documentNumberOne = "0123-abc-4567-def-8g9h";

        documentNumberService.printFirstTwoBlockWithNumber(documentNumberOne);
        documentNumberService.printNumberWithoutLetters(documentNumberOne);
        documentNumberService.printOnlyLetters(documentNumberOne);
        documentNumberService.printOnlyLettersUpCase(documentNumberOne);
        documentNumberService.checkAbcInString(documentNumberOne);
        documentNumberService.checkStartOfString(documentNumberOne);
        documentNumberService.checkEndOfString(documentNumberOne);

        StringBuilder stringBuilder = new StringBuilder(documentNumberOne);
    }
}
