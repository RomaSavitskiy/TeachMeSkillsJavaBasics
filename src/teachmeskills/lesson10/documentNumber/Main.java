package teachmeskills.lesson10.documentNumber;

import teachmeskills.lesson10.documentNumber.Service.DocumentNumberService;
import teachmeskills.lesson10.documentNumber.exception.WrongWithNumberConstruction;

import java.io.InvalidClassException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DocumentNumberService documentNumberService = new DocumentNumberService();

        documentNumberService.execute();
    }
}
