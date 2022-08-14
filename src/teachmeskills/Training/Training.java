package teachmeskills.Training;

import java.util.Arrays;

public class Training {
  public static void main(String[] args)
  {
    int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int temp;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(array));
  }
}
