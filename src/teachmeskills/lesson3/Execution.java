package teachmeskills.lesson3;

import java.util.Scanner;

public class Execution
{
  Scanner scanner = new Scanner(System.in);
  String winter = "Зимаdajs";
  String spring = "Весна";
  String summer = "Лето";
  String autumn = "Осень";

  int monthNumber;

  public void FindMonthViaSwitch(){

    System.out.println("Введите номер месяца");

    monthNumber = scanner.nextInt();

    switch(monthNumber)
    {
      case 1, 2, 12:
        System.out.println(winter);
        break;
      case 3, 4, 5:
        System.out.println(spring);
        break;
      case 6, 7, 8:
        System.out.println(summer);
        break;
      case 9, 10, 11:
        System.out.println(autumn);
    }
  }


  public void findNameOfMonthViaIf()
  {
    System.out.println("Введите номер месяца");

    monthNumber = scanner.nextInt();

    if((monthNumber == 1) || (monthNumber == 2) || (monthNumber == 12))
      System.out.println(winter);

    if((monthNumber == 3) || (monthNumber == 4) || (monthNumber == 5))
      System.out.println(spring);

    if((monthNumber == 6) || (monthNumber == 7) || (monthNumber == 8))
      System.out.println(summer);

    if((monthNumber == 9) || (monthNumber == 10) || (monthNumber == 11))
      System.out.println(autumn);
  }

  public void defineEvenNumber()
  {

    int number, temp;

    System.out.println("Введите число");

    number = scanner.nextInt();

    temp= number % 2;

    if(temp == 0)
      System.out.println("Ваше число четное");
    else
      System.out.println("Ваше число нечётное");
    }

  public void defineTemperature()
  {
    System.out.println("Введите температуру на улице");

    int temperature =  scanner.nextInt();

    if(temperature > -5)
      System.out.println("На улице Тепло");
    if((temperature <= -5) & (temperature > -20))
      System.out.println("На улице Нормально");
    if(temperature <= -20)
      System.out.println("На улице холодно");
  }

  public void defineColourRainbow()
  {
    System.out.println("Введите номер цвета радуги");

    int colour = scanner.nextInt();

    switch(colour)
    {
      case 1:
        System.out.println("Красный");
        break;
      case 2:
        System.out.println("Оранжевый");
        break;
      case 3:
        System.out.println("Жёлтый");
        break;
      case 4:
        System.out.println("Зелёный");
        break;
      case 5:
        System.out.println("Голубой");
        break;
      case 6:
        System.out.println("Синий");
        break;
      case 7:
        System.out.println("Филолетовый");
    }
  }

  public void outputNotEvenNumbers()
  {
    int temp;

    System.out.println("Нечётные числа от 1 до 99: ");

    for(int i = 1; i <=99; i++)
    {
      temp = i % 2;
      if(temp == 1)
        System.out.print(i + " ");
    }
  }

  public void outputFiveNumbers()
  {
    System.out.println("Числа от 5 до 1:");

    for(int i = 5; i>=1; i--)
    {
      System.out.print(i + " ");
    }
  }

  public void findSumNumbers()
  {
    System.out.println("Введите число");

    int number = scanner.nextInt();

    int sum = 0;

    for(int i = 1; i <= number; i++)
    {
      sum = sum + i;
    }
    System.out.println("Сумма от 0 до вашего числа:");
    System.out.println(sum);
  }

  public void outputSubsequencePlusSeven()
  {
    int i = 7;
    System.out.println("Последовательность:");

    while(i <= 98)
    {
      System.out.print(i + " ");
      i = i + 7;
    }
  }

  public void outputSubsequenceMinusFive()
  {
    int number = 0;
    System.out.println("Последовательность:");

    for (int i = 10; i >= 1; i--)
    {
      System.out.print(number + " ");
      number = number - 5;
    }
  }

    public void outputSquareNumbers()
    {
      int temp;
      System.out.println("Последовательность:");

      for(int i = 10; i <= 20; i++)
      {
        temp = i*i;
        System.out.print(temp + " ");
      }
    }

    public void outputFibonacciNumbers()
    {
      int firstNumber = 1;
      int secondNumber = 1;
      int number;

      System.out.println("Первые 10 чисел Фибоначчи ");
      System.out.print(firstNumber + " " + secondNumber + " ");

      for(int i = 3; i <= 10; i++)
      {
        number = firstNumber + secondNumber;
        System.out.print(number + " ");
        firstNumber = secondNumber;
        secondNumber = number;
      }
    }

    public void findSumInBank()
    {
      float contribution;
      int amountOfMonth;

      System.out.println("Введите сумму вклада ");
      contribution = scanner.nextInt();

      System.out.println("Введите количество месяцев хранения денег в банке ");
      amountOfMonth = scanner.nextInt();

      for(int i = 1; i <= amountOfMonth; i++)
        contribution = contribution * 1.07f;

      System.out.println("Сумма итогового вклада состовляет " + contribution);
    }


    public void multiplicationTable()
    {
      System.out.print("Таблица умножения: ");
      for(int i = 1; i <= 9; i++)
      {
        System.out.println();
        for(int j = 1; j <= 9; j++)
        {
          System.out.print((i*j) + "   ");
        }
      }
    }

    public int testMethod()
    {
         System.out.println("Hello");
         return  10;
    }
}
