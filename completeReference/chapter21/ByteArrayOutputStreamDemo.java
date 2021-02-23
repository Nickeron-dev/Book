package classes;

import java.io.*;

public class ByteArrayOutputStreamDemo {
  public static void main(String[] args) {
    ByteArrayOutputStream f = new ByteArrayOutputStream();
    String str = "This should end up in the array";
    byte[] array = str.getBytes();

    try {
      f.write(array);
    } catch(IOException exc) {
      System.out.println("Error writing to Buffer");
    }

    System.out.println("Buffer as a String");
    System.out.println(f.toString());
    System.out.println("Into array");

    byte[] secArray = f.toByteArray();
    for(int i = 0; i < secArray.length; i++) System.out.print((char) secArray[i]);

    System.out.println("\nTo an OutputStream");

    try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
      f.writeTo(f2);
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
      return;
    }

    System.out.println("Doing a reset");
    f.reset();

    for(int i = 0; i < 3; i++) {
      f.write('X');
    }

    System.out.println(f.toString());
  }
}
