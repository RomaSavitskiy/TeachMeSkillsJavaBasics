package teachmeskills.Training;

import teachmeskills.lesson12.service.FileService;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Training {
  public static void main(String[] args) throws IOException {
   /* BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("documentNumber.txt")));

    bufferedWriter.write("dsada");

    bufferedWriter.close();*/

    FileWriter fileWriter = new FileWriter("C:\\TeachMeSkill\\TeachMeSkillsRepo\\src\\teachmeskills\\Training\\documentNumber1.txt");

    fileWriter.write("sdadsa");
    fileWriter.write('\n');
    fileWriter.write("Helllo world");
    fileWriter.close();

    FileReader fileReader = new FileReader("C:\\TeachMeSkill\\TeachMeSkillsRepo\\src\\teachmeskills\\Training\\documentNumber1.txt");

    char [] a = new char[100];

    fileReader.read(a);

    for (char symbol : a) {
      System.out.print(symbol);
    }

  }
}
