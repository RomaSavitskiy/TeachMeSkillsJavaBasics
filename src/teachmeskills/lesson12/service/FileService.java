package teachmeskills.lesson12.service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private static List<String> arrayValidNumber = new ArrayList<>();
    public static List<String> arrayInvalidNumber = new ArrayList<>();

    public List<String> readFile (String documentPath) throws IOException {
        final List<String> documentLines = Files.readAllLines(Paths.get(documentPath));

        return documentLines;
    }

    public String checkNumberLength(List<String> documentLines) {
        boolean flag = false;

        for (String line : documentLines) {
            if (line.length() > 15) {
                arrayInvalidNumber.add(line + " - Некорректность длинны");

                flag = true;
            } else {
                arrayValidNumber.add((line));
            }
        }

        return !(flag = false) ? "Номера файла валидны по длинне" : "Длинна одного из номера файла больше 15";
    }

    public String checkNumberStart (List<String> documentLines) {
        for (String line : documentLines) {
            if (!(line.startsWith("docnum")) || !(line.startsWith("contract"))) {
                arrayInvalidNumber.add(line + " - Некорректность записи начала номера");

                return "Файл содержит невалидные строки";
            }
        }

        return "Строки файла валидны";
    }

    public void checkInvalidNumbers (List<String> documentLines) throws IOException, NullPointerException {
        checkNumberLength(documentLines);
        checkNumberStart(documentLines);
        addInvalidNumbers();
        addValidNumbers();
    }

    public void addValidNumbers () throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\TeachMeSkill\\TeachMeSkillsRepo\\src\\teachmeskills\\lesson12\\entity\\validNumber.txt");

        for (String line: arrayValidNumber) {
            fileWriter.write(line + '\n');
        }

        fileWriter.close();
    }

    public void addInvalidNumbers () throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\TeachMeSkill\\TeachMeSkillsRepo\\src\\teachmeskills\\lesson12\\entity\\invalidNumber");

        for (String line: arrayInvalidNumber) {
            fileWriter.write(line + '\n');
        }

        fileWriter.close();
    }

    public void printArraysWithNumbers () {
        System.out.println(arrayInvalidNumber);
        System.out.println(arrayValidNumber);
    }
}
