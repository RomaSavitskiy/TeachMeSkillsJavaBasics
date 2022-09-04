package teachmeskills.lesson18;

import org.xml.sax.SAXException;
import teachmeskills.lesson18.service.DocumentService;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentService documentService = new DocumentService();

        //C:\TeachMeSkill\TeachMeSkillsRepo\src\teachmeskills\lesson18\directoryWithFiles

        File file = new File(documentService.setDirectoryPath());

        System.out.println(documentService.checkValidOfDocument(file));

        documentService.parsingXMLFile();
    }
}
