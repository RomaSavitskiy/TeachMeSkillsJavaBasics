package teachmeskills.lesson7.DocumentSystem;

import teachmeskills.lesson7.DocumentSystem.document.Document;

import java.util.Scanner;

public class Register {
    Document[] documentArray = new Document[10];
    byte idPointer = 0;

    public void addDocumentToRegister(Document document) {
        documentArray[idPointer] = document;
        idPointer++;
    }

    public void printDocumentFromRegister() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер документа от 1 до 10");

        boolean flag = false;
        byte documentId = 0;

        while (flag == false) {
            documentId = scanner.nextByte();

            if (documentId > 0 & documentId <= idPointer) {
                flag = true;
                break;
            }

            System.out.println("Введите значение от 1 до 10");
        }

        switch (documentId) {
            case 1:
                System.out.println(documentArray[0].toString() );
                break;
            case 2:
                System.out.println(documentArray[1].toString() );
                break;
            case 3:
                System.out.println(documentArray[2].toString() );
                break;
            case 4:
                System.out.println(documentArray[3].toString() );
                break;
            case 5:
                System.out.println(documentArray[4].toString() );
                break;
            case 6:
                System.out.println(documentArray[5].toString() );
                break;
            case 7:
                System.out.println(documentArray[6].toString() );
                break;
            case 8:
                System.out.println(documentArray[7].toString() );
                break;
            case 9:
                System.out.println(documentArray[8].toString() );
                break;
            case 10:
                System.out.println(documentArray[9].toString() );
                break;
        }
    }
}
