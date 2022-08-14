package teachmeskills.lesson10.documentNumber.Service;

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

    public static void checkAbcInString(String string) {
        if (string.contains("abc") | string.contains("ABC")) {
            System.out.println("Содержит");
        }
        else {
            System.out.println("Не содержит");
        }
    }

    public static void checkStartOfString(String string) {
        if (string.startsWith("555")) {
            System.out.println("Начинается");
        }
        else {
            System.out.println("Не начинается");
        }
    }

    public static void checkEndOfString(String string) {
        if (string.endsWith("1a2b")) {
            System.out.println("Заканчивается");
        }
        else {
            System.out.println("Не заканчивается");
        }
    }
}
