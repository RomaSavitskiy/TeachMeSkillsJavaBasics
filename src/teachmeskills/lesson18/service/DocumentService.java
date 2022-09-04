package teachmeskills.lesson18.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

public class DocumentService {
    public String setDirectoryPath() {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    public boolean checkValidOfDocument(File file) {
        File[] fileArray = file.listFiles();

        assert fileArray != null;

        long amountXMLFiles = Arrays.stream(fileArray).filter(directoryFile -> directoryFile.getName().endsWith(".xml")).count();

        return amountXMLFiles == 1;
    }

    public void parsingXMLFile() throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File("C:\\TeachMeSkill\\TeachMeSkillsRepo\\src\\teachmeskills\\lesson18\\directoryWithFiles\\numberDocument.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(inputFile);
        doc.getDocumentElement().normalize();
        //NodeList nList = doc.getElementsByTagName("line");
        NodeList nList = doc.getElementsByTagName("line");

        System.out.println(doc.getDocumentElement().getNodeName());
    }
}
