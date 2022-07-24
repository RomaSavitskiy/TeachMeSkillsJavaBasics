package teachmeskills.lesson3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Выберите программу");
      System.out.println("1. Поиск поры года по номеру месяца через switch");
      System.out.println("2. Поиск поры года по номеру месяца через if");
      System.out.println("3. Проверка на чётность");
      System.out.println("4. Определение погоды на улице");
      System.out.println("5. Определение цвета радуги по номеру");
      System.out.println("6. Вывод нечётных чисел от 1 до 99");
      System.out.println("7. Вывод чисел от 5 до 1");
      System.out.println("8. Сумма чисел от 1 до N-го");
      System.out.println("9. Вывод последовательности 7, 14, 21, ..., 98");
      System.out.println("10. Вывод последовательности 0, -5, -10, ..., -45 ");
      System.out.println("11. Вывод квадратов чисел от 10 до 20 ");
      System.out.println("12. Вывод первых 11 членов последовательности Фибоначчи");
      System.out.println("13. Расчёт вклада с 7% ставкой за N количество месяцев");
      System.out.println("14. Вывод таблицы умножения");

      int numberOperation = scanner.nextInt();
      Execution execution = new Execution();

      switch (numberOperation) {
        case 1:
          execution.FindMonthViaSwitch();
          break;
        case 2:
          execution.findNameOfMonthViaIf();
          break;
        case 3:
          execution.defineEvenNumber();
          break;
        case 4:
          execution.defineTemperature();
          break;
        case 5:
          execution.defineColourRainbow();
          break;
        case 6:
          execution.outputNotEvenNumbers();
          break;
        case 7:
          execution.outputFiveNumbers();
          break;
        case 8:
          execution.findSumNumbers();
          break;
        case 9:
          execution.outputSubsequencePlusSeven();
          break;
        case 10:
          execution.outputSubsequenceMinusFive();
          break;
        case 11:
          execution.outputSquareNumbers();
          break;
        case 12:
          execution.outputFibonacciNumbers();
          break;
        case 13:
          execution.findSumInBank();
          break;
        case 14:
          execution.multiplicationTable();
        case 15:
          execution.multiplicationTable();
      }

      System.out.println();
      System.out.println("Введите любой символ, чтобы вернуться в меню");
      scanner.next();
    }
  }
}
