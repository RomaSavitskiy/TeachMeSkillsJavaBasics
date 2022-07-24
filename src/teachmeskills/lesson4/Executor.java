package teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;
public class Executor {
    Scanner scanner = new Scanner(System.in);
    public void examinationOccurrencesSymbol()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 8};
        int value;
        boolean flag = false;

        System.out.println("Массив:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Введите число");

        value = scanner.nextInt();

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
            {
                flag = true;
            }
        }

        if(flag == true)
        {
            System.out.println("Входит");
        }
        else
        {
            System.out.println("Не входит");
        }

        System.out.println();
    }

    public void deleteSymbolInArray()
    {
        int[] array = {1, 2, 3, 4, 2, 6, 8};
        int[] newArray = new int[array.length];
        int value;

        System.out.println("Массив:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Введите удаляемый символ");


        value = scanner.nextInt();
        int k = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != value)
            {
                newArray[k] = array[i];
                k++;
            }
        }

        System.out.println("Новый массив:");

        for(int i = 0; i < k; i++)
        {
           System.out.print(newArray[i] + " ");
        }

        System.out.println();
    }

    public void outputMinAverageMaxValue()
    {
        System.out.println("Введите размер нового массива");

        int length = scanner.nextInt();
        int[] array = new int[length];
        int min, average, max;

        System.out.println("Новый массив:");

        for(int i = 0; i < length; i++)
        {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        min = array[0];
        max = array[length -1];
        average = array[length/2];

        System.out.println();
        System.out.println("min: " + min);
        System.out.println("average: " + average);
        System.out.println("max: " + max);
        System.out.println();
    }

    public void findArrayAverage()
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 8, 4, 5};
        int averageArray1, averageArray2;
        int sum1 = 0, sum2 = 0;

        System.out.println("Первый массив: ");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("Второй массив: ");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
          sum1 = sum1 + array1[i];
          sum2 = sum2 + array2[i];
        }

        System.out.println("Среднее арифметическое 1 массива: " + (averageArray1 = sum1 / 5));
        System.out.println("Среднее арифметическое 2 массива: " + (averageArray2 = sum2 / 5));

        if(averageArray1 > averageArray2)
        {
            System.out.println("Среднее арифметическое 1 массива больше ");
        }
        if(averageArray1 < averageArray2)
        {
            System.out.println("Среднее арифметическое 2 массива больше ");
        }
        if(averageArray1 == averageArray2)
        {
            System.out.println("Средние арифметические массивов равны ");
        }

        System.out.println();
    }

    public void inputRightArray()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива(5 < n < 11)");

        int n = 0;
        boolean flag = false;

        while(flag == false)
        {
             n = scanner.nextInt();

             if((n > 5) & (n <= 10))
             {
                 flag = true;
             }

             if((n <= 5) || (n > 10))
             {
                 System.out.println("Некорректное значение. Повторите ввод");
             }
        }

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int k = 0;

        System.out.println("Полученный массив:");
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = (int)(Math.random() * 10);

            System.out.print(array1[i] + " ");

            if((array1[i] % 2) == 0)
            {
                array2[k] = array1[i];
                k++;
            }
        }

        System.out.println();
        System.out.println("Массив после удаления нечётных чисел:");

        for(int i = 0; i < k; i++)
        {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void swapNotEvenIndexOfArrayToZero()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Изначальный массив: ");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Изменённый массив:");

        for(int i = 0; i < array.length; i++)
        {
            if((i % 2) == 1)
            {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void sortStringArray()
    {
        String[] array = {"Влад", "Роман", "Дмитрий", "Евгений", "Егор"};

        System.out.println("Изначальный массив:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.out.println();
        System.out.println("Изменённый массив:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void bubbleSort()
    {
        int[] array = {1, 4, 2, 9, 9, 3, 6};
        int temp;

        System.out.println("Изначальный массив:");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Отсортированный массив:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }
}
