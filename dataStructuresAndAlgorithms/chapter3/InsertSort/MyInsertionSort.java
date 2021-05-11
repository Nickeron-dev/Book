import java.util.Arrays;

public class MyInsertionSort {
  public static void main(String [] args) {

    int [] array = {3, 5, 1, 4, 6, 9, 10, 2, 7, 8};

    System.out.println("Before: " + Arrays.toString(array));

    int out, in;
    for (out = 1; out < array.length; out++) {
      int temp = array[out];
      in = out;
      while (in > 0 && array[in - 1] >= temp) {
        array[in] = array[in - 1];
        in--;
      }
      array[in] = temp;
    }

    System.out.println("After: " + Arrays.toString(array));
  }
}
