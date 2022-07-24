package teachmeskills.lesson4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int numberTask;
        Scanner scanner = new Scanner(System.in);
        Executor executor = new Executor();



        while(true)
        {
            System.out.println("Выберите номер задачи");
            System.out.println("1) Проверка вхождения символа");
            System.out.println("2) Удаление веденного символа");
            System.out.println("3) Вввод минимального, среднего и максимального элемента массива");
            System.out.println("4) Сравнение средних арифметических массивов");
            System.out.println("5) Массив из n случайных чисел");
            System.out.println("6) Замена элементов с нечётным индексом на 0 ");
            System.out.println("7) Сортировка массива фамилий");
            System.out.println("8) Сортировка пузырьком");

            numberTask = scanner.nextInt();

            switch(numberTask)
            {
                case 1:
                    executor.examinationOccurrencesSymbol();
                    break;
                case 2:
                    executor.deleteSymbolInArray();
                    break;
                case 3:
                    executor.outputMinAverageMaxValue();
                    break;
                case 4:
                    executor.findArrayAverage();
                    break;
                case 5:
                    executor.inputRightArray();
                    break;
                case 6:
                    executor.swapNotEvenIndexOfArrayToZero();
                    break;
                case 7:
                    executor.sortStringArray();
                    break;
                case 8:
                    executor.bubbleSort();
                    break;
            }
        }
    }
}
