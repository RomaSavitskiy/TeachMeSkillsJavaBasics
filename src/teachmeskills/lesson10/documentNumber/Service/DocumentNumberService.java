package teachmeskills.lesson10.documentNumber.Service;

import teachmeskills.lesson10.documentNumber.exception.WrongWithEndOfNumber;
import teachmeskills.lesson10.documentNumber.exception.WrongWithNumberConstruction;
import teachmeskills.lesson10.documentNumber.exception.WrongWithStartDocumentFromFive;

import java.util.stream.Stream;
import java.util.zip.DataFormatException;

public class DocumentNumberService {
    public static void printFirstTwoBlockWithNumber(String string) {
        char[] arrayChar = string.toCharArray();

        for (int i = 0; i < 4; i++) {
            System.out.print(arrayChar[i]);
        }

        for (int i = 10; i < 13; i++) {
            System.out.print(arrayChar[i]);
        }

        System.out.println();
    }

    public static void printNumberWithoutLetters(String string) {
        char[] arrayChar = string.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            if ((i > 4 & i < 8) || (i > 13 & i < 17)) {
                arrayChar[i] = '*';
            }
            System.out.print(arrayChar[i]);
        }

        System.out.println();
    }

    public static void printOnlyLetters(String string) {
        char[] arrayChar = string.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            if ((arrayChar[i] > 96) & (arrayChar[i] < 123)) {
                System.out.print(arrayChar[i]);
            }

            if (((i == 8) | (i == 16) | (i == 19))) {
                System.out.print("/");
            }
        }

        System.out.println();
    }

    public static void printOnlyLettersUpCase(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        System.out.print("Letters:");

        for (int i = 0; i < stringBuilder.length(); i++) {
            if ((i == 8) | (i == 17) | (i == 20)) {
                System.out.print("/");
            }

            if ((i == 5) | (i == 6) | (i == 7)) {
                System.out.print(stringBuilder.charAt(i));
            }

            if ((i == 14) | (i == 15) | (i == 16)) {
                System.out.print(stringBuilder.charAt(i));
            }

            if ((i == 19) | (i == 21)) {
                System.out.print(stringBuilder.charAt(i));
            }
        }

        System.out.println();
    }

    public static void checkAbcInString(final String string) throws WrongWithNumberConstruction {
        if (string.contains("abc") | string.contains("ABC")) {
            System.out.println("Содержит");
        }
        else {
            System.out.println("Не содержит");
            throw new WrongWithNumberConstruction("Номер не соответсвует параметрам");
        }
    }

    public static void checkStartOfString(String string) throws WrongWithStartDocumentFromFive {
        if (string.startsWith("555")) {
            System.out.println("Начинается");
        }
        else {
            System.out.println("Не начинается");
            throw new WrongWithStartDocumentFromFive("Номер не соответсвует параметрам");
        }
    }

    public static void checkEndOfString(String string) throws WrongWithEndOfNumber {
        if (string.endsWith("1a2b")) {
            System.out.println("Заканчивается");
        }
        else {
            System.out.println("Не заканчивается");
            throw new WrongWithEndOfNumber("Номер не соответсвует параметрам");
        }
    }

    String documentNumberOne = "0123-vbc-4567-def-819h";

    StringBuilder stringBuilder = new StringBuilder(documentNumberOne);
    public void execute() {
        printNumberWithoutLetters(documentNumberOne);
        printOnlyLetters(documentNumberOne);
        printOnlyLettersUpCase(documentNumberOne);

        try {
            checkAbcInString(documentNumberOne);
        } catch (WrongWithNumberConstruction e) {
            e.printStackTrace();
        }

        try {
            checkStartOfString(documentNumberOne);
        } catch (WrongWithStartDocumentFromFive e) {
            e.printStackTrace();
        }

        try {
            checkEndOfString(documentNumberOne);
        } catch (WrongWithEndOfNumber e) {
            e.printStackTrace();
        }
    }
}
