import java.util.Arrays;

public class MyBubbleSort {

  public static void main(String[] args) {

    int [] array = {3, 5, 1, 4, 6, 9, 10, 2, 7, 8};

    System.out.println("Before: " + Arrays.toString(array));

    for (int i = 0; i < array.length-1; i++) {
      for (int j = 0; j < array.length - (i + 1); j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j]; // swaping
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    System.out.println("After: " + Arrays.toString(array));
  }
}
