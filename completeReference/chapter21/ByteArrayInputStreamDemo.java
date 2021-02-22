package classes;

import java.io.*;

public class ByteArrayInputStreamDemo {
  public static void main(String[] args) {
    String tmp = "abcdefghijklmnopqrstuvwxyz";
    byte[] array = tmp.getBytes();

    ByteArrayInputStream input1 = new ByteArrayInputStream(array);
    ByteArrayInputStream input2 = new ByteArrayInputStream(array, 0, 3);
  }
}
