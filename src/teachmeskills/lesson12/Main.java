package teachmeskills.lesson12;

import teachmeskills.lesson12.service.FileService;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final String validDocumentPath =  "./src/teachmeskills/lesson12/entity/validFile";
        final String invalidDocumentPath = "./src/teachmeskills/lesson12/entity/invalidFile.txt";

        System.out.print("Input the path to the document: ");

        FileService fileService = new FileService();

        String documentPath = scanner.next();

        final List<String> documentNumbers = fileService.readFile(documentPath);

        System.out.println(documentNumbers + "dsa");

        fileService.checkInvalidNumbers(documentNumbers);
        fileService.printArraysWithNumbers();
    }
}
