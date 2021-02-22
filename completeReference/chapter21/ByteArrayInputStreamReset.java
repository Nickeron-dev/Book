package classes;

import java.io.*;

public class ByteArrayInputStreamReset {
  public static void main(String[] args) {
    String tmp = "abc";
    byte[] array = tmp.getBytes();
    ByteArrayInputStream input = new ByteArrayInputStream(array);

    for(int i = 0; i < 2; i++) {
      int element;
      while((element = input.read()) != -1) {
        if(i == 0) {
          System.out.print((char) element);
        } else {
          System.out.print(Character.toUpperCase((char) element));
        }
      }
      System.out.println();
      input.reset();
    }
  }
}
