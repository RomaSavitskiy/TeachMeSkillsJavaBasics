package teachmeskills.lesson7.DocumentSystem;

import teachmeskills.lesson7.DocumentSystem.document.ContractProduct;
import teachmeskills.lesson7.DocumentSystem.document.ContractWorker;
import teachmeskills.lesson7.DocumentSystem.document.Document;
import teachmeskills.lesson7.DocumentSystem.document.FinancialInvoice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date documentDate = new Date();

        Document documentOne = new ContractProduct(1, documentDate, "Соль", 1);
        Document documentTwo = new ContractProduct(2, documentDate, "Уголь", 1);
        Document documentThree = new ContractProduct(3, documentDate, "Газ", 1000);
        Document documentFour = new ContractWorker(4, documentDate, documentDate, "Aleksandr");
        Document documentFive = new ContractWorker(5, documentDate, documentDate, "Grigoriy");
        Document documentSix = new ContractWorker(6, documentDate, documentDate, "Luka");
        Document documentSeven = new ContractWorker(7, documentDate, documentDate, "Вова");
        Document documentEight = new FinancialInvoice(8, documentDate, 100, 123);
        Document documentNine = new FinancialInvoice(9, documentDate, 200, 456);
        Document documentTen = new FinancialInvoice(10, documentDate, 200, 456);

        Register register = new Register();

        register.addDocumentToRegister(documentOne);
        register.addDocumentToRegister(documentTwo);
        register.addDocumentToRegister(documentThree);
        register.addDocumentToRegister(documentFour);
        register.addDocumentToRegister(documentFive);
        register.addDocumentToRegister(documentSix);
        register.addDocumentToRegister(documentSeven);
        register.addDocumentToRegister(documentEight);
        register.addDocumentToRegister(documentNine);
        register.addDocumentToRegister(documentTen);

        while (true) {
            register.printDocumentFromRegister();
        }
    }
}
