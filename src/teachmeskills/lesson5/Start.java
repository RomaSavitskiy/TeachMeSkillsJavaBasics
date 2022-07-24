package teachmeskills.lesson5;

import java.util.Scanner;
public class Start {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Executor executor = new Executor();

        while(true)
        {
            System.out.println("1) Замена элементов массива на их квадраты");
            System.out.println("2) Нахождение суммы строк матрицы");
            System.out.println("3) Сравнение матриц");
            System.out.println("4) Нахождение минимального элемента строк матриц");
            System.out.println("5) Сортировка строк матрицы");
            System.out.println("6) Вывод 3-ёхмерной матрицы");
            System.out.println("7) Раскраска шахматной доски");
            System.out.println("8) Умножение матриц");
            System.out.println("9) Сумма элементов матрицы");
            System.out.println("10) Вывод диагоналей матрицы");
            System.out.println("11) Сортировка строк массива");

            int taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1:
                    executor.outputSquare();
                    break;
                case 2:
                    executor.outputSumLines();
                    break;
                case 3:
                    executor.comparisonArrays();
                    break;
                case 4:
                    executor.findMinValue();
                    break;
                case 5:
                    executor.sortArraysLines();
                    break;
                case 6:
                    executor.threeDimensionalArray();
                    break;
                case 7:
                    executor.setColourInChess();
                    break;
                case 8:
                    executor.multMatrix();
                    break;
                case 9:
                    executor.sumMatrixElem();
                    break;
                case 10:
                    executor.outputDiagonalsOfMatrix();
                    break;
                case 11:
                    executor.sortingArrayLines();
                    break;
            }
        }
    }
}
