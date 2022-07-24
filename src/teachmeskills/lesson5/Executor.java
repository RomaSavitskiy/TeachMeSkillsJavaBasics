package teachmeskills.lesson5;

import java.util.Arrays;

public class Executor
{

    public void outputSquare()
    {
        int[][] array = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};

        System.out.println("Данная матрица: ");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Преобразованная матрица:");

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                array[i][j] = array[i][j] * array[i][j];
            }
        }

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }


    public void outputSumLines()
    {
        int[][] array = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int sum = 0;

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                sum = sum + array[i][j] ;
            }
            System.out.println(sum);
            sum = 0;
        }

    }

    public void comparisonArrays()
    {
        int[][] array1 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int[][] array2 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        boolean flag = false;

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                if(array1[i][j] != array2[i][j])
                {
                    System.out.println("No equal");
                    flag = true;
                }
            }
        }

        if(flag == false)
        {
            System.out.println("Equal");
        }

    }

    public void findMinValue()
    {
        int[][] array1 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int min = array1[0][0];

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                if(array1[i][j] < min)
                {
                    min = array1[i][j];
                }
            }
            System.out.print(min + " ");
            min = array1[i][0];
        }
        System.out.println();
        System.out.println();
    }

    public void sortArraysLines()
    {
        int[][] array = {{9, 2, 1, 4}, {9, 1, 1, 10}, {0, 3, 4, 6}};
        int temp;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length - 1; j++)
            {
                for (int k = 0; k < array[i].length ; k++)
                {
                    if (array[i][j] > array[i][j + 1])
                    {
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void threeDimensionalArray()
    {
        int[][][] array = new int[3][3][3];

        System.out.println();
        System.out.println("Изначальные матрицы 3-ёхмерного массива:");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                for(int k = 0; k < array[i][j].length; k++)
                {
                    array[i][j][k] = (int)(Math.random() * 10);
                    array[i][j][k] = array[i][j][k] + array[i][j][k];
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Изменённый массив: ");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                for(int k = 0; k < array[i][j].length; k++)
                {
                    array[i][j][k] = array[i][j][k] + array[i][j][k];
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void setColourInChess()
    {
        String[][] array = new String[8][8];

        boolean flag = false;

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(flag == false)
                {
                    array[i][j] = "W";
                    flag = true;
                }
                else
                {
                    array[i][j] = "B";
                    flag = false;
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multMatrix()
    {
        int[][] array1 =  {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 =  {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] array3 = new int[4][4];

        System.out.println("Первый массив:");

        for(int i = 0; i < array1.length; i++)
        {
            for(int j = 0; j < array1[i].length; j++)
            {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Второй массив:");

        for(int i = 0; i < array2.length; i++)
        {
            for(int j = 0; j < array2[i].length; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 3; i++)
        {
            for(int u = 0 ; u < 3; u++)
            {
                for(int j = 0; j < 4; j++)
                {
                    array3[i][u] += array1[i][j] * array2[j][u];
                }
            }
        }

        System.out.println();
        System.out.println("Новый массив: ");

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumMatrixElem()
    {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};

        int sum = 0;

        System.out.println("Дан массив: ");

        for(int i = 0; i < array.length; i++)
        {
            for( int j = 0; j <array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                sum += array[i][j];
            }
        }

        System.out.println("Сумма всех элементов массива = " + sum);
    }

    public void outputDiagonalsOfMatrix()
    {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int d = 0;

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Побочная диагональ: ");

        for (int i = (array.length - 1); i >= 0; i--)
        {
            System.out.print(array[i][i] + " ");
        }

        System.out.println();
        System.out.println("Главная диагональ:");

        for (int i = (array.length - 1); i >= 0; i--)
        {
            System.out.print(array[i][(array.length - 1) - i] + " ");
        }

        System.out.println();
    }

    public void sortingArrayLines()
    {
        int[][] array = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Изначальный массив:");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            Arrays.sort(array[i]);
            System.out.println();
        }



        System.out.println();
        System.out.println("Отсортированный: массив");

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
