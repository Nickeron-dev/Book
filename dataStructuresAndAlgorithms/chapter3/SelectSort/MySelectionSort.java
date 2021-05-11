import java.util.Arrays;

public class MySelectionSort {
  public static void main(String[] args) {

    int [] array = {3, 5, 1, 4, 6, 9, 10, 2, 7, 8};

    System.out.println("Before: " + Arrays.toString(array));

    for (int out = 0; out < array.length - 1; out++) {
      int min = out;
      for (int in = out + 1; in < array.length; in++) {
        if (array[min] > array[in]) {
          min = in;
        }
      } // after las for loop min variable is an index of the lowest number
      int temp = array[out];
      array[out] = array[min];
      array[min] = temp;
    }

    System.out.println("After: " + Arrays.toString(array));
  }
}
