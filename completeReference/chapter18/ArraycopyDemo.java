package classes;

import java.io.*;
import java.util.Arrays;

public class ArraycopyDemo {
  static byte[] first = {60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70};
  static byte[] second = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    // static arraycopy(SourceArray, startIndexSource,
    //                  TargetArray, startIndexTarget, length)
    
    pw.println("first array: " + Arrays.toString(first));
    pw.println("second array: " + Arrays.toString(second));
    System.arraycopy(first, 0, second, 0, first.length);
    pw.println("first array: " + Arrays.toString(first));
    pw.println("second array: " + Arrays.toString(second));
    System.arraycopy(first, 0, first, 1, first.length - 1);
    System.arraycopy(second, 0, second, 1, second.length - 1);
    pw.println("first array: " + Arrays.toString(first));
    pw.println("second array: " + Arrays.toString(second));
  }
}
