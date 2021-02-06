package classes;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    int[] array = new int[10];
    for(int i = 0; i < 10; i++) {
      array[i] = -3 * i;
    }

    System.out.println("Original comtent: ");
    display(array);
    Arrays.sort(array); // sorting array
    System.out.println("Sorted array");
    display(array);

    System.out.println("Fill(): ");
    Arrays.fill(array, 2, 5, 2); // 5th element is not changed
    display(array);

    // Binary search for -24
    int targetIndex = Arrays.binarySearch(array, -24);

    System.out.println("-24th index is: " + targetIndex);
  }
  public static void display(int[] array) {
    for(int i : array) System.out.print(i + " ");
    System.out.println();
  }
}
