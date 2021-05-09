import java.util.Arrays;

public class MyExampleOfLowArray {
  private static int[] array;
  private static int length;

  public MyExampleOfLowArray(int length) {
    array = new int[length];
    this.length = length;
  }

  public static void main(String [] args) {
    MyExampleOfLowArray obj = new MyExampleOfLowArray(10);
    int counter = 0;

    for (int i = 0; i < length; i++) {
      array[i] = counter;
      counter++;
    }

    System.out.println(Arrays.toString(array));

    int deleteIndex = 3;
    // deleting element
    for (int i = deleteIndex; i < length - 1; i++) {
      array[i] = array[i + 1]; // moving everything back
    }

    length = length - 1;

    System.out.println(Arrays.toString(array));

    deleteIndex = 6;
    // deleting element
    for (int i = deleteIndex; i < length - 1; i++) {
      array[i] = array[i + 1]; // moving everything back
    }

    length = length - 1;

    System.out.println(Arrays.toString(array));
  }
}
